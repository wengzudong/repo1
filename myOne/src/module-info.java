import com.itheima03.Impl.Czxy;
import com.itheima03.MyService;
import com.itheima03.Impl.itheima;

module myOne {
    exports com.itheima01;
    exports com.itheima03;
    provides MyService with itheima;

}