import java.util.Comparator;


class MyComp implements Comparator<FileBean>{
 
    @Override
    public int compare(FileBean e1, FileBean e2) {
        if(e1.getP() < e2.getP()){
            return 1;
        } else {
            return -1;
        }
    }
}