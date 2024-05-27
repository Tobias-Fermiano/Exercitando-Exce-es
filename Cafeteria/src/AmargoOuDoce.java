public class AmargoOuDoce {

    private boolean escolha;

    public AmargoOuDoce(String a) {
        if (a.equals("doce")) {
            this.escolha = true;
        } else {
            this.escolha = false;
        }
        decide(this.escolha);
    }

    public void decide(boolean escolha) {
        if (escolha) {
            System.out.println("Cuida do diabetis jovem!");
        } else {
            System.out.println("Dá próxima vez adicione mais açucar!");
        }
    }

    public String toString() {
        return escolha ? "doce" : "amargo";
    }
}
