package tasklar.SentyabrTask.Lesson1_9.shape;
//perimetr
//------------------------------------------------------------------------
public class GetPerimetr extends Shapes {
        private final double width;
        private final double height;

        public GetPerimetr(double width, double height) {
            this.width = width;
            this.height = height;
        }
        public double getPerimetr(){
            return 2*(width + height);
        }
}
