public class day3{
public static void main(String[] args) {
char ch1='A';
char ch2='d';
System.out.println("ch1="+ch1+" ch2="+ch2);
ch1=(char) ((ch1-'a')+(ch2-'a'));
ch2= (char) (('a')+ch1-(ch2-'a'));
ch1= (char) ('a'+ch1-(ch2-'a'));
System.out.println("after swap");
System.out.println("ch1="+ch1+" ch2="+ch2);
}
}
        