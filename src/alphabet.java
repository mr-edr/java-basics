import java.util.Locale;
import java.util.Scanner;
public class alphabet {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String word =s.nextLine();
        for(char ch : word.toUpperCase().toCharArray()){
            switch(ch) {
                case 'A':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i == 1 || i == 5 || j == 1 || j == 10) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;

                case 'B':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if ((i == 1 && j == 10) || (i == 10 && j == 10)) {
                                System.out.print(" ");
                            } else if (i == 1 || i == 5 || i == 10 || j == 1 || j == 10) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'C':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i == 1 || i == 10 || j == 1) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'D':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if ((i == 1 && j == 10) || (i == 10 && j == 10)) {
                                System.out.print("  ");
                            } else if (i == 1 || i == 10 || j == 1 || j == 10) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'E':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i == 1 || i == 5 || i == 10 || j == 1) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'F':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i == 1 || i == 5 || j == 1) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'G':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i == 1 || i == 10 || j == 1 || (i == 5 && j > 5) || (j == 10 && i > 5)) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'H':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i == 5 || j == 1 | j == 10) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'I':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (j == 5 || i == 1 || i == 10) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'J':


                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i == 10 && j > 5) {
                                System.out.print(" ");
                            } else if (j == 5 || i == 1 || i == 10 || (j == 1 && i > 7)) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'K':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i - j == 4 || i + j == 7) {
                                System.out.print("⚡ ");
                            } else if (j == 1) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'L':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i == 10 || j == 1) {
                                System.out.print("⚡ ");
                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'M':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if ((i - j == -1 && j < 6) || (i + j == 10 && j > 5)) {
                                System.out.print("⚡ ");
                            } else if (j == 1 || j == 10) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'N':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i - j == 0) {
                                System.out.print("⚡ ");
                            } else if (j == 1 || j == 10) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'O':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if ((i == 1 && (j == 1 || j == 10) || (i == 10 && (j == 1 || j == 10)))) {
                                System.out.print("  ");
                            } else if (i == 1 || i == 10 || j == 1 || j == 10) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'P':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if ((
                                    j == 1 || ((i == 1 || i == 5)) && j < 7) || (j == 7 && i < 6)) {
                                System.out.print("⚡ ");
                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'Q':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if ((i == 1 && (j == 1 || j == 9)) || (i == 9 && j == 1)) {
                                System.out.print("  ");
                            } else if ((j < 9 && (i == 1 || i == 9)) || (i < 9 && (j == 1 || j == 9)) || (i - j == 0 && j > 5)) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'R':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if ((j == 1 || ((i == 1 || i == 5)) && j < 7) || (j == 7 && i < 6) || (i - j == 4)) {
                                System.out.print("⚡ ");
                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'S':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i == 1 || i == 10 || i == 6 || (j == 1 && (i > 7 || i < 6)) || (j == 10 && (i < 4 || i > 5))) {
                                System.out.print("⚡ ");
                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'T':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i == 1 || j == 5) {
                                System.out.print("⚡ ");
                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }

                    break;
                case 'U':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i == 10 && (j == 1 || j == 10)) System.out.print("  ");
                            else if (j == 1 || j == 10 || i == 10) {
                                System.out.print("⚡ ");
                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }

                    break;
                case 'V':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i == 10) System.out.print("  ");
                            else if (i - j == 4 || i + j == 15 || ((j == 1 || j == 10) && (i < 6)))
                                System.out.print("⚡ ");
                            else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'W':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if ((i - j == -1 && j > 5) || (i + j == 10 && j < 6)) {
                                System.out.print("⚡ ");
                            } else if (j == 1 || j == 10) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'X':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i - j == 0 || i + j == 11) {
                                System.out.print("⚡ ");
                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'Y':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if ((i - j == 0 && j < 6) || (i + j == 11 && j > 5)) {
                                System.out.print("⚡ ");
                            } else if ((j == 5 || j == 6) && i > 5) {
                                System.out.print("⚡ ");

                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 'Z':

                    for (int i = 1; i <= 10; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i == 1 || i == 10 || (j == 1 && i < 4) || (j == 10 && i > 7) || i + j == 11) {
                                System.out.print("⚡ ");
                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println();
            }
            System.out.println();
        }
    }
}

