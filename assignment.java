public class assignment {
    public static void main(String[] args) {
        double force[]={12.4,23.2,30.5,60.8,116.5,293.8,597.3};
        double mass[]={2,4,5,10,10,50,100};
        double gravity= 9.81;
        
        for(int i=0; i<force.length ;i++){
            for(int j=0; j<mass.length ; j++){
                float coeffFriction = (double)force[i]/(mass[j]*gravity);
            }
        }
    }
}
