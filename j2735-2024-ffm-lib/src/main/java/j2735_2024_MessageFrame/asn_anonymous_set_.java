// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct {
 *     void **array;
 *     int count;
 *     int size;
 *     void (*free)(void *);
 * }
 * }
 */
public class asn_anonymous_set_ {

    asn_anonymous_set_() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("array"),
        MessageFrame_h.C_INT.withName("count"),
        MessageFrame_h.C_INT.withName("size"),
        MessageFrame_h.C_POINTER.withName("free")
    ).withName("$anon$64:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout array$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("array"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void **array
     * }
     */
    public static final AddressLayout array$layout() {
        return array$LAYOUT;
    }

    private static final long array$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void **array
     * }
     */
    public static final long array$offset() {
        return array$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void **array
     * }
     */
    public static MemorySegment array(MemorySegment struct) {
        return struct.get(array$LAYOUT, array$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void **array
     * }
     */
    public static void array(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(array$LAYOUT, array$OFFSET, fieldValue);
    }

    private static final OfInt count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int count
     * }
     */
    public static final OfInt count$layout() {
        return count$LAYOUT;
    }

    private static final long count$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int count
     * }
     */
    public static final long count$offset() {
        return count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int count
     * }
     */
    public static int count(MemorySegment struct) {
        return struct.get(count$LAYOUT, count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int count
     * }
     */
    public static void count(MemorySegment struct, int fieldValue) {
        struct.set(count$LAYOUT, count$OFFSET, fieldValue);
    }

    private static final OfInt size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int size
     * }
     */
    public static final OfInt size$layout() {
        return size$LAYOUT;
    }

    private static final long size$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int size
     * }
     */
    public static final long size$offset() {
        return size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int size
     * }
     */
    public static int size(MemorySegment struct) {
        return struct.get(size$LAYOUT, size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int size
     * }
     */
    public static void size(MemorySegment struct, int fieldValue) {
        struct.set(size$LAYOUT, size$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*free)(void *)
     * }
     */
    public static class free {

        free() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            MessageFrame_h.C_POINTER
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
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout free$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("free"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*free)(void *)
     * }
     */
    public static final AddressLayout free$layout() {
        return free$LAYOUT;
    }

    private static final long free$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*free)(void *)
     * }
     */
    public static final long free$offset() {
        return free$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*free)(void *)
     * }
     */
    public static MemorySegment free(MemorySegment struct) {
        return struct.get(free$LAYOUT, free$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*free)(void *)
     * }
     */
    public static void free(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(free$LAYOUT, free$OFFSET, fieldValue);
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

