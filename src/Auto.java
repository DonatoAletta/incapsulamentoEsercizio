public class Auto {

    private String marca;
    private String modello;
    private String targa;
    private int cilindrata;

    public Auto(String marca, String modello, String targa, int cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca == null || marca.isEmpty()){
            throw new IllegalArgumentException("La marca non può essere un valore vuoto");
        }
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        if(modello == null || modello.isEmpty()){
            throw new IllegalArgumentException("Il Modello non può essere un valore vuoto");
        }
        this.modello = modello;

    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        if(targa == null || targa.isEmpty()){
            throw new IllegalArgumentException("La Targa non può essere un valore vuoto");
        }
        this.targa = targa;
    }

    public int getCilindrata() {

        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
            if(cilindrata < 0){
                throw new IllegalArgumentException("Il Valore inserito non può essere negativo");
            }
                this.cilindrata = cilindrata;
        }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", targa='" + targa + '\'' +
                ", cilindrata=" + cilindrata +
                '}';
    }
}
