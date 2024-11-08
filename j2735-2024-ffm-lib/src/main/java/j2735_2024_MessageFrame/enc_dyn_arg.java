// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct enc_dyn_arg {
 *     void *buffer;
 *     size_t length;
 *     size_t allocated;
 * }
 * }
 */
public class enc_dyn_arg {

    enc_dyn_arg() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("buffer"),
        MessageFrame_h.C_LONG.withName("length"),
        MessageFrame_h.C_LONG.withName("allocated")
    ).withName("enc_dyn_arg");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout buffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("buffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *buffer
     * }
     */
    public static final AddressLayout buffer$layout() {
        return buffer$LAYOUT;
    }

    private static final long buffer$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *buffer
     * }
     */
    public static final long buffer$offset() {
        return buffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *buffer
     * }
     */
    public static MemorySegment buffer(MemorySegment struct) {
        return struct.get(buffer$LAYOUT, buffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *buffer
     * }
     */
    public static void buffer(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(buffer$LAYOUT, buffer$OFFSET, fieldValue);
    }

    private static final OfLong length$LAYOUT = (OfLong)$LAYOUT.select(groupElement("length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t length
     * }
     */
    public static final OfLong length$layout() {
        return length$LAYOUT;
    }

    private static final long length$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t length
     * }
     */
    public static final long length$offset() {
        return length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t length
     * }
     */
    public static long length(MemorySegment struct) {
        return struct.get(length$LAYOUT, length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t length
     * }
     */
    public static void length(MemorySegment struct, long fieldValue) {
        struct.set(length$LAYOUT, length$OFFSET, fieldValue);
    }

    private static final OfLong allocated$LAYOUT = (OfLong)$LAYOUT.select(groupElement("allocated"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t allocated
     * }
     */
    public static final OfLong allocated$layout() {
        return allocated$LAYOUT;
    }

    private static final long allocated$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t allocated
     * }
     */
    public static final long allocated$offset() {
        return allocated$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t allocated
     * }
     */
    public static long allocated(MemorySegment struct) {
        return struct.get(allocated$LAYOUT, allocated$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t allocated
     * }
     */
    public static void allocated(MemorySegment struct, long fieldValue) {
        struct.set(allocated$LAYOUT, allocated$OFFSET, fieldValue);
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

