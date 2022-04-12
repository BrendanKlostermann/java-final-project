public class TestPad {
    class GasTank{
        private double amount = 0;

        private double capacity;


        public GasTank(double z){

            capacity = z;

        }

        public void addGas(double x){

            amount = amount + x;

            if(amount > capacity){

                amount = capacity;

            }

        }

        public void useGas(double y){

            amount = amount - y;

            if(amount < 0){

                amount = 0;

            }

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

        	double fill = capacity - amount;

        	amount = capacity;

            return(fill);

        }


    }
}
