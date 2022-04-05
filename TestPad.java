public class TestPad {
    public void printAttitude(int x){

    }
    class GasTank{
        double amount = 0;
        double capacity;

        public GasTank(double z){
            capacity = z;
        }
        public double addGas(double x){
            amount = amount + x;
            if(amount > capacity){
                amount = capacity;
            }
            return amount;
        }
        public double useGas(double y){
            amount = amount - y;
            if(amount < 0){
                amount = 0;
            }
            return amount;
        }
        public boolean isEmpty(){
            if(amount < .1){
                return true;
            } else{
                return false;
            }
        }
        public boolean isFull(){
            if(amount > capacity-.1){
            return true;
            } else{
                return false;
            }
        }
        public double getGasLevel(){
            return amount;
        }
        public double fillUp(){
            return(capacity - amount);
        }

    }
}
