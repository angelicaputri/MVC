package mvc.sederhana;

public class Controller {
    private Model modelhe;
    private View viewhe;

    public Controller(Model modelhe, View viewhe) {
        this.modelhe=modelhe;
        this.viewhe=viewhe;
    }

    public void setNamaMahasiswa(String nama){
        modelhe.setNama(nama);
    }
    public void setNimMahasiswa(String nim){
        modelhe.setNim(nim);
    }
    public String getNamaMahasiswa(String nama){
        return modelhe.getNama();
    }
    public String getNimMahasiswa(String nim){
        return modelhe.getNim();
    }
    
    public void updateView(){
        viewhe.CetakData(modelhe.getNama(), modelhe.getNim());
    }
}
