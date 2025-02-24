// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.invoke.*;
import java.lang.foreign.*;

/**
 * {@snippet lang=c :
 * ssize_t (*body_receiver)(void *, const void *, size_t, int)
 * }
 */
public class jer_decode_general$body_receiver {

    jer_decode_general$body_receiver() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        long apply(MemorySegment _x0, MemorySegment _x1, long _x2, int _x3);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        MessageFrame_h.C_LONG,
        MessageFrame_h.C_POINTER,
        MessageFrame_h.C_POINTER,
        MessageFrame_h.C_LONG,
        MessageFrame_h.C_INT
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
    public static long invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, long _x2, int _x3) {
        try {
            return (long) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

