public class Main {
    public static void main(String[] args) {

        int popolneno = 1001 ;
        int bonusovNachisleno ;
        int tekushSchet = 500 ;
        int bonusovVsego = 10;

        if (popolneno > 1000) {
            bonusovNachisleno = popolneno / 100;
        } else {bonusovNachisleno = 0; }

        //popolneno > 1000 ? bonusovNachisleno = popolneno / 100 : bonusovNachisleno = 0 ;

        int itogSchet = tekushSchet + popolneno ;
        bonusovVsego = bonusovVsego + bonusovNachisleno ;

        System.out.println( "Рублей на вашем счету - " + itogSchet + " ; Бонусов - " + bonusovVsego + "." ) ;




    }
}