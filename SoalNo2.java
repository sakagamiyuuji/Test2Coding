public class SoalNo2{
  public static void main(String[] args) {
    for(int i=1; i<=100; i++){
        if (i%2 == 0 && i%3==0){
          System.out.print(" INDONESIA ");
        }
        else if (i%2 == 0){
          System.out.print(" " + i + " ");
        }
        else if(i%2 != 0){
          System.out.print(" GANJIL");
        }

  }
}
}
