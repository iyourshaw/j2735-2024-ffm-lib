// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.invoke.*;
import java.lang.foreign.*;

/**
 * {@snippet lang=c :
 * typedef __ssize_t (cookie_read_function_t)(void *, char *, size_t)
 * }
 */
public class cookie_read_function_t {

    cookie_read_function_t() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        long apply(MemorySegment __cookie, MemorySegment __buf, long __nbytes);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        MessageFrame_h.C_LONG,
        MessageFrame_h.C_POINTER,
        MessageFrame_h.C_POINTER,
        MessageFrame_h.C_LONG
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = MessageFrame_h.upcallHandle(Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static long invoke(MemorySegment funcPtr,MemorySegment __cookie, MemorySegment __buf, long __nbytes) {
        try {
            return (long) DOWN$MH.invokeExact(funcPtr, __cookie, __buf, __nbytes);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

