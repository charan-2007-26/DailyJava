public class RevString {
    public static void main(String[] args) {
        String str="charan";
        String revstr="";
        char ch;
        for(int i=0;i<=str.length()-1;i++){
            ch=str.charAt(i);
            revstr=ch+revstr;
        }
        System.out.println(revstr);
    }
    
}
