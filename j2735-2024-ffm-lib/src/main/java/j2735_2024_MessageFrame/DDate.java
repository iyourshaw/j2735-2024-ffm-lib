// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct DDate {
 *     DYear_t year;
 *     DMonth_t month;
 *     DDay_t day;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class DDate {

    DDate() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("year"),
        MessageFrame_h.C_LONG.withName("month"),
        MessageFrame_h.C_LONG.withName("day"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("DDate");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong year$LAYOUT = (OfLong)$LAYOUT.select(groupElement("year"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DYear_t year
     * }
     */
    public static final OfLong year$layout() {
        return year$LAYOUT;
    }

    private static final long year$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DYear_t year
     * }
     */
    public static final long year$offset() {
        return year$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DYear_t year
     * }
     */
    public static long year(MemorySegment struct) {
        return struct.get(year$LAYOUT, year$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DYear_t year
     * }
     */
    public static void year(MemorySegment struct, long fieldValue) {
        struct.set(year$LAYOUT, year$OFFSET, fieldValue);
    }

    private static final OfLong month$LAYOUT = (OfLong)$LAYOUT.select(groupElement("month"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DMonth_t month
     * }
     */
    public static final OfLong month$layout() {
        return month$LAYOUT;
    }

    private static final long month$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DMonth_t month
     * }
     */
    public static final long month$offset() {
        return month$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DMonth_t month
     * }
     */
    public static long month(MemorySegment struct) {
        return struct.get(month$LAYOUT, month$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DMonth_t month
     * }
     */
    public static void month(MemorySegment struct, long fieldValue) {
        struct.set(month$LAYOUT, month$OFFSET, fieldValue);
    }

    private static final OfLong day$LAYOUT = (OfLong)$LAYOUT.select(groupElement("day"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DDay_t day
     * }
     */
    public static final OfLong day$layout() {
        return day$LAYOUT;
    }

    private static final long day$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DDay_t day
     * }
     */
    public static final long day$offset() {
        return day$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DDay_t day
     * }
     */
    public static long day(MemorySegment struct) {
        return struct.get(day$LAYOUT, day$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DDay_t day
     * }
     */
    public static void day(MemorySegment struct, long fieldValue) {
        struct.set(day$LAYOUT, day$OFFSET, fieldValue);
    }

    private static final GroupLayout _asn_ctx$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("_asn_ctx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static final GroupLayout _asn_ctx$layout() {
        return _asn_ctx$LAYOUT;
    }

    private static final long _asn_ctx$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static final long _asn_ctx$offset() {
        return _asn_ctx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static MemorySegment _asn_ctx(MemorySegment struct) {
        return struct.asSlice(_asn_ctx$OFFSET, _asn_ctx$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static void _asn_ctx(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, _asn_ctx$OFFSET, _asn_ctx$LAYOUT.byteSize());
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

