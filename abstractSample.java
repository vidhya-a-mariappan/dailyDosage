abstract class abstractSample {
        public String name = "Vidhya";
        public String email = "vidhya.a@zohocorp.com";
        public int age = 33;
        public abstract void work();
    }
    class joining extends abstractSample {
        public int yearOfJoining = 2022;
        public void work() {
            System.out.println("Achieved the goal and start a new career");
        }
        }

