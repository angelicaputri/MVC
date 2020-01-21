package mvc.sederhana;
public class MVCSederhana {
    public static void main(String[] args) {
       Model mahasiswa = new Model();
       mahasiswa.setNama("Putri");
       mahasiswa.setNim("11");
       
       View apa = new View();
       
       Controller what = new Controller(mahasiswa, apa);
       what.updateView();
    }
}
