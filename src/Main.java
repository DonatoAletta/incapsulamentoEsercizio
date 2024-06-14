public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto("Fiat","Panda" ,"PD 336EM", 1200);
        getterOutput(auto);


}
    public static void getterOutput(Auto auto){
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modello: " + auto.getModello());
        System.out.println("Targa: " + auto.getTarga());
        System.out.println("Cilindrata: " + auto.getCilindrata());

    }

}

