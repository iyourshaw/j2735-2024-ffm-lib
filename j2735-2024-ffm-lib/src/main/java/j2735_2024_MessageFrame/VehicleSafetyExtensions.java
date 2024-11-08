// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct VehicleSafetyExtensions {
 *     VehicleEventFlags_t *events;
 *     struct PathHistory *pathHistory;
 *     struct PathPrediction *pathPrediction;
 *     ExteriorLights_t *lights;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class VehicleSafetyExtensions {

    VehicleSafetyExtensions() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("events"),
        MessageFrame_h.C_POINTER.withName("pathHistory"),
        MessageFrame_h.C_POINTER.withName("pathPrediction"),
        MessageFrame_h.C_POINTER.withName("lights"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("VehicleSafetyExtensions");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout events$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("events"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VehicleEventFlags_t *events
     * }
     */
    public static final AddressLayout events$layout() {
        return events$LAYOUT;
    }

    private static final long events$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VehicleEventFlags_t *events
     * }
     */
    public static final long events$offset() {
        return events$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VehicleEventFlags_t *events
     * }
     */
    public static MemorySegment events(MemorySegment struct) {
        return struct.get(events$LAYOUT, events$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VehicleEventFlags_t *events
     * }
     */
    public static void events(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(events$LAYOUT, events$OFFSET, fieldValue);
    }

    private static final AddressLayout pathHistory$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pathHistory"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PathHistory *pathHistory
     * }
     */
    public static final AddressLayout pathHistory$layout() {
        return pathHistory$LAYOUT;
    }

    private static final long pathHistory$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PathHistory *pathHistory
     * }
     */
    public static final long pathHistory$offset() {
        return pathHistory$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PathHistory *pathHistory
     * }
     */
    public static MemorySegment pathHistory(MemorySegment struct) {
        return struct.get(pathHistory$LAYOUT, pathHistory$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PathHistory *pathHistory
     * }
     */
    public static void pathHistory(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pathHistory$LAYOUT, pathHistory$OFFSET, fieldValue);
    }

    private static final AddressLayout pathPrediction$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pathPrediction"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PathPrediction *pathPrediction
     * }
     */
    public static final AddressLayout pathPrediction$layout() {
        return pathPrediction$LAYOUT;
    }

    private static final long pathPrediction$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PathPrediction *pathPrediction
     * }
     */
    public static final long pathPrediction$offset() {
        return pathPrediction$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PathPrediction *pathPrediction
     * }
     */
    public static MemorySegment pathPrediction(MemorySegment struct) {
        return struct.get(pathPrediction$LAYOUT, pathPrediction$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PathPrediction *pathPrediction
     * }
     */
    public static void pathPrediction(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pathPrediction$LAYOUT, pathPrediction$OFFSET, fieldValue);
    }

    private static final AddressLayout lights$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lights"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ExteriorLights_t *lights
     * }
     */
    public static final AddressLayout lights$layout() {
        return lights$LAYOUT;
    }

    private static final long lights$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ExteriorLights_t *lights
     * }
     */
    public static final long lights$offset() {
        return lights$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ExteriorLights_t *lights
     * }
     */
    public static MemorySegment lights(MemorySegment struct) {
        return struct.get(lights$LAYOUT, lights$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ExteriorLights_t *lights
     * }
     */
    public static void lights(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lights$LAYOUT, lights$OFFSET, fieldValue);
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

