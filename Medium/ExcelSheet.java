public class ExcelSheet {
    public static String excelColumn(int N){
        StringBuilder colum=new StringBuilder();
        while(N>0){
            int r=N%26;
            if(r!=0){
                colum.append((char)('A'+r-1));
                N/=26;
            }
            else{
                colum.append('Z');
                N=N/26-1;
            }
        }
        colum.reverse();
        return colum.toString();
    
    }
    public static void main(String[] args) {
        int n = 7;
        excelColumn(n);
    }
    
}
