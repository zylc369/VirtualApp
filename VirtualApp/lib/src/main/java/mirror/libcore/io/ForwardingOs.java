package mirror.libcore.io;

import mirror.RefClass;
import mirror.RefObject;

/**
 * @author Lody
 */

public class ForwardingOs {
    public static Class<?> TYPE = RefClass.load(ForwardingOs.class, "libcore.io.ForwardingOs");
    /**
     * os字段
     * 将在RefClass.load中初始化
     */
    public static RefObject<Object> os;
}
