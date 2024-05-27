public class Personagem {

        private static final int frio = 20;
        private static final int quente = 40;

        public void tomarCafe(TemperaturaException c) throws FrioException, QuenteException {

            int temperatura = c.getTemperatura();
            if (temperatura <= frio) {
                throw new FrioException(temperatura);
            }
            else if (temperatura >= quente) {
                throw new QuenteException(temperatura);
            }
        }
    }

