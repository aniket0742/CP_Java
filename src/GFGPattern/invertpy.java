package GFGPattern;

 class invertpy {
    public static void main(String[] args) {
         printriangle(5);
    }
    static void printriangle(int n){
    for(int i=0;i<=n;i++){
         for(int j=1;j<=i;j++){
             System.out.print(" ");
         }


         for(int c=1;c<=((2)*(n-i-1)+1);c++){
             System.out.print("*");

         }
         for(int d=1;d<=i;d++){
             System.out.print(" ");

         }
         System.out.println();
     }

 }
}
