public class apattern {

    static void main() {

        System.out.println(" A ");

         for(int i = 1;i<=10;i++){
             for(int j = 1;j<=10;j++){
                 if(i==1 || i== 5 || j==1 || j==10){
                     System.out.print("❤ ");

                 }
                 else System.out.print("  ");
             }
             System.out.println();
         }

        System.out.println("\n B ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if((i==1 && j==10) || (i==10 && j==10)){
                    System.out.print(" ");
                }
                else if(i==1 || i== 5 || i==10|| j==1 || j==10){
                    System.out.print("❤ ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n C ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if(i==1 || i==10|| j==1 ){
                    System.out.print("❤ ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n D ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if((i==1 && j==10) || (i==10 && j==10)){
                    System.out.print(" ");
                }
                else if(i==1 || i==10 || j==1 ||j==10){
                    System.out.print("❤ ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n E ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if(i==1 || i==5 || i==10 || j==1){
                    System.out.print("❤ ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n F ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if(i==1 || i==5 || j==1){
                    System.out.print("❤ ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n G ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if(i==1 || i==10 || j==1 ||(i==5 && j>5) || (j==10 && i>5)){
                    System.out.print("❤ ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }
        
        System.out.println("\n H ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if(i==5 || j==1 | j==10){
                    System.out.print("❤ ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n I ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if(j==5 || i==1 || i==10){
                    System.out.print("❤ ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n J ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if(i==10 && j>5){
                    System.out.print(" ");
                }
                else if(j==5 || i==1 || i==10 || (j==1 && i>7)){
                    System.out.print("❤ ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n K ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if(i-j==4 || i+j==7){
                    System.out.print("❤ ");
                }
                else if(j==1){
                    System.out.print("❤ ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n L ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if(i==10 || j==1) {
                    System.out.print("❤ ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n M ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if((i-j==-1 && j<6) || ( i+j==10 && j>5 )){
                    System.out.print("❤ ");
                }
                else if(j==1 || j==10){
                    System.out.print("❤ ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n N ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if(i-j==0 ){
                    System.out.print("❤ ");
                }
                else if(j==1 || j==10){
                    System.out.print("❤ ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n O ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if((i==1 && (j==1 || j==10 ) || (i==10 &&(j==1 || j==10))) ){
                    System.out.print("  ");
                }
                else if(i==1 || i==10 || j==1 || j==10){
                    System.out.print("❤ ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n P ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if((
                        j==1 || ((i==1 || i==5)) && j<7) || (j==7 && i<6) ) {
                    System.out.print("❤ ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n Q ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if((i==1 && (j==1 || j==9 )) || (i==9 && j==1) ){
                    System.out.print("  ");
                }
                else if((j<9 && (i==1 || i==9)) || (i<9 && (j==1 || j==9)) || (i-j==0 && j>5)){
                    System.out.print("❤ ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n R ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if((j==1 || ((i==1 || i==5)) && j<7) || (j==7 && i<6) || (i-j==4) ) {
                    System.out.print("❤ ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n S ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if(i==1 || i==10 || i==6 || (j==1 && (i>7 || i<6)) || (j==10 && (i<4 || i>5))  ) {
                    System.out.print("❤ ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n T ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if( i==1 || j==5 ) {
                    System.out.print("❤ ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }


        System.out.println("\n U ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if (i==10 && (j==1 || j==10)) System.out.print("  ");
                else if(j==1 || j==10 || i==10 ) {
                    System.out.print("❤ ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }


        System.out.println("\n V ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if (i==10) System.out.print("  ");
                else if (i-j==4 || i+j==15|| ((j==1|| j==10) && (i<6))) System.out.print("❤ ");
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n W ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if((i-j==-1 && j>5) || ( i+j==10 && j<6 )){
                    System.out.print("❤ ");
                }
                else if(j==1 || j==10){
                    System.out.print("❤ ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n X ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if(i-j==0 ||  i+j==11 ){
                    System.out.print("❤ ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n Y ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if((i-j==0 && j<6) || ( i+j==11 && j>5 )){
                    System.out.print("❤ ");
                }
                else if((j==5 || j==6 ) && i>5 ){
                    System.out.print("❤ ");

                }
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n Z ");

        for(int i = 1;i<=10;i++){
            for(int j = 1;j<=10;j++){
                if(i==1 || i==10 || (j==1 && i<4) || (j==10 && i>7) || i+j==11  ) {
                    System.out.print("❤ ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }




    }
}

