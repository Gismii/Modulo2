
    public class Cachorro extends Animal{

        public Cachorro(String nome) {
            super(nome);
        }

        @Override
        public void caminha() {
            System.out.println("Cachorro Caminhando ...");
        }

        public void late(){
            System.out.println("Au Au");
        }


    }

