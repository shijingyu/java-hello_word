//package day2;
///** 图形  final static abstract*/
//public  class Shape extends Object {
//    /** 图形位置 Point*/
//    Point location;
//    /** 计算面积, 存在计算面积的功能, 具体功能需要具体图形提供(覆盖) */
//    public double area(){
//        return 0;
//    }
//    /** 包含contains, 判断当前图形是否包含一个坐标, 必须由子类覆盖  */
//    public boolean contains(int x, int y){
//        return false;
//    }
//    /** 判断当前图形是否包含一个点对象,  */
//    public boolean contains(Point p){
//        //调用当前对象的包含方法contains(int, int)实现,
//        //这个当前对象, 运行期间的具体对象, 可能是一个圆实例
//        //包含方法就是这个圆对象的方法
//        return this.contains(p.x, p.y);
//    }
//}
//
//
//
//
//
