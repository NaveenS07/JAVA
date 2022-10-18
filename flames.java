import java.util.*;
public class naveencr7{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String boy=sc.nextLine().toUpperCase(),temp="";
        String girl=sc.nextLine().toUpperCase();
         if(boy.length()<girl.length()){
           temp=boy;
           boy=girl;
           girl=temp;
        }
        StringBuffer small=new StringBuffer(girl);
        StringBuffer big=new StringBuffer(boy); 
       int a=cr7(big,small),val=6,i=0,count=1;
        ArrayList<Character>flames1=new ArrayList<Character>();
        flames1.add('f');
        flames1.add('l');
        flames1.add('a');
        flames1.add('m');
        flames1.add('e');
        flames1.add('s');
       HashMap<Character,String>flames=new HashMap<Character,String>();
       flames.put('f',"friends");
       flames.put('l',"love");
       flames.put('a',"affection");
       flames.put('m',"marriage");
       flames.put('e',"enemy");
       flames.put('s',"sister");
     while(flames1.size()>1){
         if(count%a==0){
            flames1.remove(i);
             count++;
         }
         else{
          i++;
         count++;
         }
         if(i>flames1.size()-1)
         i=0;
     }
       System.out.println(flames1.get(0)+" "+flames.get(flames1.get(0)));
    }
    public static int cr7(StringBuffer big,StringBuffer small){
        int count=0;
        String dummi="";
        for(int i=0;i<small.length();i++){
            for(int j=0;j<big.length();j++){
                if(small.charAt(i)==big.charAt(j)){
                    big.deleteCharAt(j);
                    j--;
                    dummi+=small.charAt(i);
                    break;
                }
            }
        }
        for(int i=0;i<dummi.length();i++){
            for(int j=0;j<small.length();j++){
                if(dummi.charAt(i)==small.charAt(j)){
                    small.deleteCharAt(j);
                    j--;
                    break;
                }
            }
        }
        int luck=small.length()+big.length();
        System.out.println(small.append(big));
        return luck;
    }
}
