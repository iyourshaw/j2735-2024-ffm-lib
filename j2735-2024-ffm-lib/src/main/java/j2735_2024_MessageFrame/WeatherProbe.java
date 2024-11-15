// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct WeatherProbe {
 *     AmbientAirTemperature_t *airTemp;
 *     AmbientAirPressure_t *airPressure;
 *     struct WiperSet *rainRates;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class WeatherProbe {

    WeatherProbe() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("airTemp"),
        MessageFrame_h.C_POINTER.withName("airPressure"),
        MessageFrame_h.C_POINTER.withName("rainRates"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("WeatherProbe");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout airTemp$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("airTemp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AmbientAirTemperature_t *airTemp
     * }
     */
    public static final AddressLayout airTemp$layout() {
        return airTemp$LAYOUT;
    }

    private static final long airTemp$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AmbientAirTemperature_t *airTemp
     * }
     */
    public static final long airTemp$offset() {
        return airTemp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AmbientAirTemperature_t *airTemp
     * }
     */
    public static MemorySegment airTemp(MemorySegment struct) {
        return struct.get(airTemp$LAYOUT, airTemp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AmbientAirTemperature_t *airTemp
     * }
     */
    public static void airTemp(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(airTemp$LAYOUT, airTemp$OFFSET, fieldValue);
    }

    private static final AddressLayout airPressure$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("airPressure"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AmbientAirPressure_t *airPressure
     * }
     */
    public static final AddressLayout airPressure$layout() {
        return airPressure$LAYOUT;
    }

    private static final long airPressure$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AmbientAirPressure_t *airPressure
     * }
     */
    public static final long airPressure$offset() {
        return airPressure$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AmbientAirPressure_t *airPressure
     * }
     */
    public static MemorySegment airPressure(MemorySegment struct) {
        return struct.get(airPressure$LAYOUT, airPressure$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AmbientAirPressure_t *airPressure
     * }
     */
    public static void airPressure(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(airPressure$LAYOUT, airPressure$OFFSET, fieldValue);
    }

    private static final AddressLayout rainRates$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rainRates"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct WiperSet *rainRates
     * }
     */
    public static final AddressLayout rainRates$layout() {
        return rainRates$LAYOUT;
    }

    private static final long rainRates$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct WiperSet *rainRates
     * }
     */
    public static final long rainRates$offset() {
        return rainRates$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct WiperSet *rainRates
     * }
     */
    public static MemorySegment rainRates(MemorySegment struct) {
        return struct.get(rainRates$LAYOUT, rainRates$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct WiperSet *rainRates
     * }
     */
    public static void rainRates(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rainRates$LAYOUT, rainRates$OFFSET, fieldValue);
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

