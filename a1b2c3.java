package Practice;

public class a1b2c3 {
    public void sol(String a, int n){
        char letter=' ';
        int num= 0;
        for(char i : a.toCharArray()){
            if(Character.isLetter(i) ){
                if(num!=0){
                    for(int j=0;j<num;j++){
                      System.out.print(letter);
                    }
                }
                letter=i;
                num=0;
            }
            else {
                num=num*10+(i-'0');
            }
        }
        for(int i=0;i<num;i++){
            System.out.print(letter);
        }
    }

    public static void main(String[] args) {
        String a="a1b2c3";
        int n=a.length();
        a1b2c3 ob= new a1b2c3();
        ob.sol(a,n);

    }
}
