// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct RptTransitVehData {
 *     long *currNumPasngers;
 *     long *avgNumPasngers;
 *     long *trnstVehSchAdh;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class RptTransitVehData {

    RptTransitVehData() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("currNumPasngers"),
        MessageFrame_h.C_POINTER.withName("avgNumPasngers"),
        MessageFrame_h.C_POINTER.withName("trnstVehSchAdh"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("RptTransitVehData");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout currNumPasngers$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("currNumPasngers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long *currNumPasngers
     * }
     */
    public static final AddressLayout currNumPasngers$layout() {
        return currNumPasngers$LAYOUT;
    }

    private static final long currNumPasngers$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long *currNumPasngers
     * }
     */
    public static final long currNumPasngers$offset() {
        return currNumPasngers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long *currNumPasngers
     * }
     */
    public static MemorySegment currNumPasngers(MemorySegment struct) {
        return struct.get(currNumPasngers$LAYOUT, currNumPasngers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long *currNumPasngers
     * }
     */
    public static void currNumPasngers(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(currNumPasngers$LAYOUT, currNumPasngers$OFFSET, fieldValue);
    }

    private static final AddressLayout avgNumPasngers$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("avgNumPasngers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long *avgNumPasngers
     * }
     */
    public static final AddressLayout avgNumPasngers$layout() {
        return avgNumPasngers$LAYOUT;
    }

    private static final long avgNumPasngers$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long *avgNumPasngers
     * }
     */
    public static final long avgNumPasngers$offset() {
        return avgNumPasngers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long *avgNumPasngers
     * }
     */
    public static MemorySegment avgNumPasngers(MemorySegment struct) {
        return struct.get(avgNumPasngers$LAYOUT, avgNumPasngers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long *avgNumPasngers
     * }
     */
    public static void avgNumPasngers(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(avgNumPasngers$LAYOUT, avgNumPasngers$OFFSET, fieldValue);
    }

    private static final AddressLayout trnstVehSchAdh$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("trnstVehSchAdh"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long *trnstVehSchAdh
     * }
     */
    public static final AddressLayout trnstVehSchAdh$layout() {
        return trnstVehSchAdh$LAYOUT;
    }

    private static final long trnstVehSchAdh$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long *trnstVehSchAdh
     * }
     */
    public static final long trnstVehSchAdh$offset() {
        return trnstVehSchAdh$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long *trnstVehSchAdh
     * }
     */
    public static MemorySegment trnstVehSchAdh(MemorySegment struct) {
        return struct.get(trnstVehSchAdh$LAYOUT, trnstVehSchAdh$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long *trnstVehSchAdh
     * }
     */
    public static void trnstVehSchAdh(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(trnstVehSchAdh$LAYOUT, trnstVehSchAdh$OFFSET, fieldValue);
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

