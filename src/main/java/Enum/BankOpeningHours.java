package Enum;

public enum BankOpeningHours {
    MONDAY{
        @Override
        void openingHours() {
            System.out.println("9-16");
        }
    },
    TUESDAY {
        public void openingHours() {
            System.out.println("9am - 3pm");
        }
    },
    WEDNESDAY {
        public void openingHours() {
            System.out.println("9am - 3pm");
        }
    },
    THURSDAY {
        public void openingHours() {
            System.out.println("9am - 1pm");
        }
    },
    FRIDAY {
        public void openingHours() {
            System.out.println("9am - 1pm");
        }
    },
    SATURDAY {
        public void openingHours() {
            System.out.println("9am - 1pm");
        }
    },
    SUNDAY {
        public void openingHours() {
            System.out.println("Closed");
        }
    };

     abstract void openingHours();

}
