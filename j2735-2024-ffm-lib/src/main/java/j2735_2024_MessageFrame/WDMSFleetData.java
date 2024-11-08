// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct WDMSFleetData {
 *     struct NtcipPavementTreatment *pavementTreat;
 *     ITIS_ITIStext_t *routingAdvice;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class WDMSFleetData {

    WDMSFleetData() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("pavementTreat"),
        MessageFrame_h.C_POINTER.withName("routingAdvice"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("WDMSFleetData");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pavementTreat$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pavementTreat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct NtcipPavementTreatment *pavementTreat
     * }
     */
    public static final AddressLayout pavementTreat$layout() {
        return pavementTreat$LAYOUT;
    }

    private static final long pavementTreat$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct NtcipPavementTreatment *pavementTreat
     * }
     */
    public static final long pavementTreat$offset() {
        return pavementTreat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct NtcipPavementTreatment *pavementTreat
     * }
     */
    public static MemorySegment pavementTreat(MemorySegment struct) {
        return struct.get(pavementTreat$LAYOUT, pavementTreat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct NtcipPavementTreatment *pavementTreat
     * }
     */
    public static void pavementTreat(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pavementTreat$LAYOUT, pavementTreat$OFFSET, fieldValue);
    }

    private static final AddressLayout routingAdvice$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("routingAdvice"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ITIS_ITIStext_t *routingAdvice
     * }
     */
    public static final AddressLayout routingAdvice$layout() {
        return routingAdvice$LAYOUT;
    }

    private static final long routingAdvice$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ITIS_ITIStext_t *routingAdvice
     * }
     */
    public static final long routingAdvice$offset() {
        return routingAdvice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ITIS_ITIStext_t *routingAdvice
     * }
     */
    public static MemorySegment routingAdvice(MemorySegment struct) {
        return struct.get(routingAdvice$LAYOUT, routingAdvice$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ITIS_ITIStext_t *routingAdvice
     * }
     */
    public static void routingAdvice(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(routingAdvice$LAYOUT, routingAdvice$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 16;

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

