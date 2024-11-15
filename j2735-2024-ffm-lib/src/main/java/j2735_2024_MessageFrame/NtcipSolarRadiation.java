// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct NtcipSolarRadiation {
 *     NTCIPEssTotalRadiationV4_t solarRadiation;
 *     NTCIPEssTotalRadiationPeriod_t measurementPeriod;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class NtcipSolarRadiation {

    NtcipSolarRadiation() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("solarRadiation"),
        MessageFrame_h.C_LONG.withName("measurementPeriod"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("NtcipSolarRadiation");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong solarRadiation$LAYOUT = (OfLong)$LAYOUT.select(groupElement("solarRadiation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * NTCIPEssTotalRadiationV4_t solarRadiation
     * }
     */
    public static final OfLong solarRadiation$layout() {
        return solarRadiation$LAYOUT;
    }

    private static final long solarRadiation$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * NTCIPEssTotalRadiationV4_t solarRadiation
     * }
     */
    public static final long solarRadiation$offset() {
        return solarRadiation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * NTCIPEssTotalRadiationV4_t solarRadiation
     * }
     */
    public static long solarRadiation(MemorySegment struct) {
        return struct.get(solarRadiation$LAYOUT, solarRadiation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * NTCIPEssTotalRadiationV4_t solarRadiation
     * }
     */
    public static void solarRadiation(MemorySegment struct, long fieldValue) {
        struct.set(solarRadiation$LAYOUT, solarRadiation$OFFSET, fieldValue);
    }

    private static final OfLong measurementPeriod$LAYOUT = (OfLong)$LAYOUT.select(groupElement("measurementPeriod"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * NTCIPEssTotalRadiationPeriod_t measurementPeriod
     * }
     */
    public static final OfLong measurementPeriod$layout() {
        return measurementPeriod$LAYOUT;
    }

    private static final long measurementPeriod$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * NTCIPEssTotalRadiationPeriod_t measurementPeriod
     * }
     */
    public static final long measurementPeriod$offset() {
        return measurementPeriod$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * NTCIPEssTotalRadiationPeriod_t measurementPeriod
     * }
     */
    public static long measurementPeriod(MemorySegment struct) {
        return struct.get(measurementPeriod$LAYOUT, measurementPeriod$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * NTCIPEssTotalRadiationPeriod_t measurementPeriod
     * }
     */
    public static void measurementPeriod(MemorySegment struct, long fieldValue) {
        struct.set(measurementPeriod$LAYOUT, measurementPeriod$OFFSET, fieldValue);
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

