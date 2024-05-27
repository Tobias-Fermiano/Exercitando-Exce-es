import javax.swing.*;

public class Cafeteria {

    public Cafeteria(){}

    public static void main(String []args) {

        String entra, escolha;
        Integer temp;
        entra = JOptionPane.showInputDialog("Qual a temperatura ideal para o seu café?");
        temp = Integer.valueOf(entra);

        escolha = JOptionPane.showInputDialog("O café estava amargo ou doce?");

        new Cafeteria().serveCliente(new Personagem(), new TemperaturaException(temp),new AmargoOuDoce(escolha));
    }

    private void serveCliente(Personagem p, TemperaturaException c, AmargoOuDoce escolha){

        try{
            p.tomarCafe(c);
            escolha.toString();
            System.out.println("A temperatura do café estava ótima!");
        }catch (FrioException e) {
            int temperatura = e.getTemperatura();
            e.printStackTrace();
            System.out.println("O café esta muito frio! " + temperatura + " graus Celsius.");
        }catch (QuenteException e) {
            int temperatura = e.getTemperatura();
            System.out.println("O café esta muito quente! "+ temperatura + " graus Celsius.");
            e.printStackTrace();
        }finally{
            System.out.println("Sirva outra xícara por favor!");
        }
    }
}