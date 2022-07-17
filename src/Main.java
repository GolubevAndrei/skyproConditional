public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Ты можешь водить");
        }
        else  {
            System.out.println("Ты не можешь водить");
        }

        int ageDrive = 19;
        if (ageDrive >= 18 && ageDrive <= 21) {
            System.out.println("Ты достаточно взрослый, чтобы водтить, но не достаточно взрослый, что бы употреблять алкоголь");
        }

        int ageSchool = 19;
        boolean canNotGoToSchool = ageSchool < 7 || ageSchool > 18;
        if (canNotGoToSchool) {
            System.out.println("Я думаю ты не ходишь в школу");
        }

        boolean skyClear = true;
        if (skyClear) {
            System.out.println("Небо чистое");
        }

        int ageDrink = 19;
        if (ageDrink > 18) {
            System.out.println("Ты должен праздновать");
            if (ageDrink < 21) {
                System.out.println("Выпей сливочного пива");
            } else {
                System.out.println("Иди куда хочешь и пей, что хочешь.");
            }
        } else if (ageDrink > 7) {
                    System.out.println("Иди в школу");
                } else {
                    System.out.println("Иди в детский сад");
                }

        int ageCongratuation = 6;
        if (ageCongratuation == 18) {
            System.out.println("С окончанием школы!");
        } else if (ageCongratuation == 21) {
            System.out.println("Теперь тебе можно пить алкоголь");
        } else if (ageCongratuation == 7) {
            System.out.println("Иди в школу");
        } else {
            System.out.println("Новостей нет");
        }
    }
}