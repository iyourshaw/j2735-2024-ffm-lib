// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct RoadRoughness {
 *     Common_MeanVariation_t meanVerticalVariation;
 *     VariationStdDev_t *verticalVariationStdDev;
 *     Common_MeanVariation_t *meanHorizontalVariation;
 *     VariationStdDev_t *horizontalVariationStdDev;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class RoadRoughness {

    RoadRoughness() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("meanVerticalVariation"),
        MessageFrame_h.C_POINTER.withName("verticalVariationStdDev"),
        MessageFrame_h.C_POINTER.withName("meanHorizontalVariation"),
        MessageFrame_h.C_POINTER.withName("horizontalVariationStdDev"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("RoadRoughness");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong meanVerticalVariation$LAYOUT = (OfLong)$LAYOUT.select(groupElement("meanVerticalVariation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Common_MeanVariation_t meanVerticalVariation
     * }
     */
    public static final OfLong meanVerticalVariation$layout() {
        return meanVerticalVariation$LAYOUT;
    }

    private static final long meanVerticalVariation$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Common_MeanVariation_t meanVerticalVariation
     * }
     */
    public static final long meanVerticalVariation$offset() {
        return meanVerticalVariation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Common_MeanVariation_t meanVerticalVariation
     * }
     */
    public static long meanVerticalVariation(MemorySegment struct) {
        return struct.get(meanVerticalVariation$LAYOUT, meanVerticalVariation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Common_MeanVariation_t meanVerticalVariation
     * }
     */
    public static void meanVerticalVariation(MemorySegment struct, long fieldValue) {
        struct.set(meanVerticalVariation$LAYOUT, meanVerticalVariation$OFFSET, fieldValue);
    }

    private static final AddressLayout verticalVariationStdDev$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("verticalVariationStdDev"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VariationStdDev_t *verticalVariationStdDev
     * }
     */
    public static final AddressLayout verticalVariationStdDev$layout() {
        return verticalVariationStdDev$LAYOUT;
    }

    private static final long verticalVariationStdDev$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VariationStdDev_t *verticalVariationStdDev
     * }
     */
    public static final long verticalVariationStdDev$offset() {
        return verticalVariationStdDev$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VariationStdDev_t *verticalVariationStdDev
     * }
     */
    public static MemorySegment verticalVariationStdDev(MemorySegment struct) {
        return struct.get(verticalVariationStdDev$LAYOUT, verticalVariationStdDev$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VariationStdDev_t *verticalVariationStdDev
     * }
     */
    public static void verticalVariationStdDev(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(verticalVariationStdDev$LAYOUT, verticalVariationStdDev$OFFSET, fieldValue);
    }

    private static final AddressLayout meanHorizontalVariation$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("meanHorizontalVariation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Common_MeanVariation_t *meanHorizontalVariation
     * }
     */
    public static final AddressLayout meanHorizontalVariation$layout() {
        return meanHorizontalVariation$LAYOUT;
    }

    private static final long meanHorizontalVariation$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Common_MeanVariation_t *meanHorizontalVariation
     * }
     */
    public static final long meanHorizontalVariation$offset() {
        return meanHorizontalVariation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Common_MeanVariation_t *meanHorizontalVariation
     * }
     */
    public static MemorySegment meanHorizontalVariation(MemorySegment struct) {
        return struct.get(meanHorizontalVariation$LAYOUT, meanHorizontalVariation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Common_MeanVariation_t *meanHorizontalVariation
     * }
     */
    public static void meanHorizontalVariation(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(meanHorizontalVariation$LAYOUT, meanHorizontalVariation$OFFSET, fieldValue);
    }

    private static final AddressLayout horizontalVariationStdDev$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("horizontalVariationStdDev"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VariationStdDev_t *horizontalVariationStdDev
     * }
     */
    public static final AddressLayout horizontalVariationStdDev$layout() {
        return horizontalVariationStdDev$LAYOUT;
    }

    private static final long horizontalVariationStdDev$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VariationStdDev_t *horizontalVariationStdDev
     * }
     */
    public static final long horizontalVariationStdDev$offset() {
        return horizontalVariationStdDev$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VariationStdDev_t *horizontalVariationStdDev
     * }
     */
    public static MemorySegment horizontalVariationStdDev(MemorySegment struct) {
        return struct.get(horizontalVariationStdDev$LAYOUT, horizontalVariationStdDev$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VariationStdDev_t *horizontalVariationStdDev
     * }
     */
    public static void horizontalVariationStdDev(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(horizontalVariationStdDev$LAYOUT, horizontalVariationStdDev$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 32;

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

