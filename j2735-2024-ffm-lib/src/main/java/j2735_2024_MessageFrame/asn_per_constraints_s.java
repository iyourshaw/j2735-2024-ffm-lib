// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct asn_per_constraints_s {
 *     asn_per_constraint_t value;
 *     asn_per_constraint_t size;
 *     int (*value2code)(unsigned int);
 *     int (*code2value)(unsigned int);
 * }
 * }
 */
public class asn_per_constraints_s {

    asn_per_constraints_s() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        asn_per_constraint_s.layout().withName("value"),
        asn_per_constraint_s.layout().withName("size"),
        MessageFrame_h.C_POINTER.withName("value2code"),
        MessageFrame_h.C_POINTER.withName("code2value")
    ).withName("asn_per_constraints_s");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout value$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * asn_per_constraint_t value
     * }
     */
    public static final GroupLayout value$layout() {
        return value$LAYOUT;
    }

    private static final long value$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * asn_per_constraint_t value
     * }
     */
    public static final long value$offset() {
        return value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * asn_per_constraint_t value
     * }
     */
    public static MemorySegment value(MemorySegment struct) {
        return struct.asSlice(value$OFFSET, value$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * asn_per_constraint_t value
     * }
     */
    public static void value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, value$OFFSET, value$LAYOUT.byteSize());
    }

    private static final GroupLayout size$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * asn_per_constraint_t size
     * }
     */
    public static final GroupLayout size$layout() {
        return size$LAYOUT;
    }

    private static final long size$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * asn_per_constraint_t size
     * }
     */
    public static final long size$offset() {
        return size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * asn_per_constraint_t size
     * }
     */
    public static MemorySegment size(MemorySegment struct) {
        return struct.asSlice(size$OFFSET, size$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * asn_per_constraint_t size
     * }
     */
    public static void size(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, size$OFFSET, size$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * int (*value2code)(unsigned int)
     * }
     */
    public static class value2code {

        value2code() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(int _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            MessageFrame_h.C_INT,
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
        public static int invoke(MemorySegment funcPtr,int _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout value2code$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("value2code"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int (*value2code)(unsigned int)
     * }
     */
    public static final AddressLayout value2code$layout() {
        return value2code$LAYOUT;
    }

    private static final long value2code$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int (*value2code)(unsigned int)
     * }
     */
    public static final long value2code$offset() {
        return value2code$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int (*value2code)(unsigned int)
     * }
     */
    public static MemorySegment value2code(MemorySegment struct) {
        return struct.get(value2code$LAYOUT, value2code$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int (*value2code)(unsigned int)
     * }
     */
    public static void value2code(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(value2code$LAYOUT, value2code$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * int (*code2value)(unsigned int)
     * }
     */
    public static class code2value {

        code2value() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(int _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            MessageFrame_h.C_INT,
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
        public static int invoke(MemorySegment funcPtr,int _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout code2value$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("code2value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int (*code2value)(unsigned int)
     * }
     */
    public static final AddressLayout code2value$layout() {
        return code2value$LAYOUT;
    }

    private static final long code2value$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int (*code2value)(unsigned int)
     * }
     */
    public static final long code2value$offset() {
        return code2value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int (*code2value)(unsigned int)
     * }
     */
    public static MemorySegment code2value(MemorySegment struct) {
        return struct.get(code2value$LAYOUT, code2value$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int (*code2value)(unsigned int)
     * }
     */
    public static void code2value(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(code2value$LAYOUT, code2value$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

