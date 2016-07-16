package im.r_c.android.dbox.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * DBox
 * Created by richard on 7/16/16.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Column {
    String name() default "";
    boolean notNull() default false;
    boolean unique() default false;
    boolean primaryKey() default false;
    boolean autoIncrement() default false;
}
