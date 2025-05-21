public class MethodeOveriding {
    public void run() {
        System.out.println("everybody should run daily");
    }
}
    class over extends MethodeOveriding{
        public void run(){
            System.out.println("runners are healdy person");
        }
    }
    class main{
        public static void main(String [] args){
            MethodeOveriding MO = new over();
            MO.run();
        }
    }

