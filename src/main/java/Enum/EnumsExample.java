package Enum;

public class EnumsExample extends Object{
    public static void main(String[] args) {

        double yards = ConversionType.METER_TO_YARDS.convert(15);
        System.out.println(yards);
        System.out.println(ConversionType.CM_TO_INCHES.convert(23));
        System.out.println(ConversionType.INCHES_TO_CM.convert(23));
        System.out.println(ConversionType.YARDS_TO_METER.convert(11));


        Session winter = Session.WINTER;
        System.out.println(winter == Session.WINTER);
        System.out.println(winter.equals(Session.WINTER));

        for (Session session : Session.values()) {
            System.out.println(session.name() + " " + session.ordinal());
        }

        Session summer = Session.valueOf("SUMMER");
        System.out.println(summer);

        switch (summer) {
            case WINTER:
                System.out.println("Let's play with snow");
                break;
            case SUMMER:
                System.out.println("Let's go swimming.");
                break;
            case AUTUMN:
                System.out.println("Let's go for a walk.");
                break;
            default:
                System.out.println("Let's stay at home and watch movies");
        }

        for (Country country : Country.values()) {
            System.out.println(country.ordinal() + " - " + country.name() + " - " + country.getPopulationDensity());
        }

        BankOpeningHours bankOpeningHours = BankOpeningHours.FRIDAY;
        bankOpeningHours.openingHours();

    }

}

