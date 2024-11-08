// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct asn_random_fill_result_s {
 *     enum {
 *         ARFILL_FAILED = -1,
 *         ARFILL_OK = 0,
 *         ARFILL_SKIPPED = 1
 *     } code;
 *     size_t length;
 * }
 * }
 */
public class asn_random_fill_result_s {

    asn_random_fill_result_s() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_INT.withName("code"),
        MemoryLayout.paddingLayout(4),
        MessageFrame_h.C_LONG.withName("length")
    ).withName("asn_random_fill_result_s");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt code$LAYOUT = (OfInt)$LAYOUT.select(groupElement("code"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum {
     *     ARFILL_FAILED = -1,
     *     ARFILL_OK = 0,
     *     ARFILL_SKIPPED = 1
     * } code
     * }
     */
    public static final OfInt code$layout() {
        return code$LAYOUT;
    }

    private static final long code$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum {
     *     ARFILL_FAILED = -1,
     *     ARFILL_OK = 0,
     *     ARFILL_SKIPPED = 1
     * } code
     * }
     */
    public static final long code$offset() {
        return code$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum {
     *     ARFILL_FAILED = -1,
     *     ARFILL_OK = 0,
     *     ARFILL_SKIPPED = 1
     * } code
     * }
     */
    public static int code(MemorySegment struct) {
        return struct.get(code$LAYOUT, code$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum {
     *     ARFILL_FAILED = -1,
     *     ARFILL_OK = 0,
     *     ARFILL_SKIPPED = 1
     * } code
     * }
     */
    public static void code(MemorySegment struct, int fieldValue) {
        struct.set(code$LAYOUT, code$OFFSET, fieldValue);
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

