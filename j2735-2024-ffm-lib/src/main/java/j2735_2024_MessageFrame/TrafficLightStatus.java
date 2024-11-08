// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct TrafficLightStatus {
 *     TrafficLightType_t trafficLightType;
 *     ConsecutiveTrafficLight_t consecutiveTrafficLight;
 *     TrafficLightIntervalType_t trafficLightIntervalType;
 *     PedestrianCall_t pedestrianCall;
 *     ActuatedInterval_t actuatedinterval;
 *     PermissiveNonProtected_t permissiveNonProtected;
 *     TrafficLightingStatus_t lightingStatus;
 *     TimeInSecond_B8_t maxIntervalLength;
 *     TimeInSecond_B8_t remainingTime;
 *     TrafficLightDirectionCode_t directionCode;
 *     ReservedBit_t reserved;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class TrafficLightStatus {

    TrafficLightStatus() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("trafficLightType"),
        MessageFrame_h.C_LONG.withName("consecutiveTrafficLight"),
        MessageFrame_h.C_LONG.withName("trafficLightIntervalType"),
        MessageFrame_h.C_INT.withName("pedestrianCall"),
        MessageFrame_h.C_INT.withName("actuatedinterval"),
        MessageFrame_h.C_LONG.withName("permissiveNonProtected"),
        MessageFrame_h.C_LONG.withName("lightingStatus"),
        MessageFrame_h.C_LONG.withName("maxIntervalLength"),
        MessageFrame_h.C_LONG.withName("remainingTime"),
        MessageFrame_h.C_LONG.withName("directionCode"),
        MessageFrame_h.C_INT.withName("reserved"),
        MemoryLayout.paddingLayout(4),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("TrafficLightStatus");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong trafficLightType$LAYOUT = (OfLong)$LAYOUT.select(groupElement("trafficLightType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TrafficLightType_t trafficLightType
     * }
     */
    public static final OfLong trafficLightType$layout() {
        return trafficLightType$LAYOUT;
    }

    private static final long trafficLightType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TrafficLightType_t trafficLightType
     * }
     */
    public static final long trafficLightType$offset() {
        return trafficLightType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TrafficLightType_t trafficLightType
     * }
     */
    public static long trafficLightType(MemorySegment struct) {
        return struct.get(trafficLightType$LAYOUT, trafficLightType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TrafficLightType_t trafficLightType
     * }
     */
    public static void trafficLightType(MemorySegment struct, long fieldValue) {
        struct.set(trafficLightType$LAYOUT, trafficLightType$OFFSET, fieldValue);
    }

    private static final OfLong consecutiveTrafficLight$LAYOUT = (OfLong)$LAYOUT.select(groupElement("consecutiveTrafficLight"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ConsecutiveTrafficLight_t consecutiveTrafficLight
     * }
     */
    public static final OfLong consecutiveTrafficLight$layout() {
        return consecutiveTrafficLight$LAYOUT;
    }

    private static final long consecutiveTrafficLight$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ConsecutiveTrafficLight_t consecutiveTrafficLight
     * }
     */
    public static final long consecutiveTrafficLight$offset() {
        return consecutiveTrafficLight$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ConsecutiveTrafficLight_t consecutiveTrafficLight
     * }
     */
    public static long consecutiveTrafficLight(MemorySegment struct) {
        return struct.get(consecutiveTrafficLight$LAYOUT, consecutiveTrafficLight$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ConsecutiveTrafficLight_t consecutiveTrafficLight
     * }
     */
    public static void consecutiveTrafficLight(MemorySegment struct, long fieldValue) {
        struct.set(consecutiveTrafficLight$LAYOUT, consecutiveTrafficLight$OFFSET, fieldValue);
    }

    private static final OfLong trafficLightIntervalType$LAYOUT = (OfLong)$LAYOUT.select(groupElement("trafficLightIntervalType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TrafficLightIntervalType_t trafficLightIntervalType
     * }
     */
    public static final OfLong trafficLightIntervalType$layout() {
        return trafficLightIntervalType$LAYOUT;
    }

    private static final long trafficLightIntervalType$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TrafficLightIntervalType_t trafficLightIntervalType
     * }
     */
    public static final long trafficLightIntervalType$offset() {
        return trafficLightIntervalType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TrafficLightIntervalType_t trafficLightIntervalType
     * }
     */
    public static long trafficLightIntervalType(MemorySegment struct) {
        return struct.get(trafficLightIntervalType$LAYOUT, trafficLightIntervalType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TrafficLightIntervalType_t trafficLightIntervalType
     * }
     */
    public static void trafficLightIntervalType(MemorySegment struct, long fieldValue) {
        struct.set(trafficLightIntervalType$LAYOUT, trafficLightIntervalType$OFFSET, fieldValue);
    }

    private static final OfInt pedestrianCall$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pedestrianCall"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PedestrianCall_t pedestrianCall
     * }
     */
    public static final OfInt pedestrianCall$layout() {
        return pedestrianCall$LAYOUT;
    }

    private static final long pedestrianCall$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PedestrianCall_t pedestrianCall
     * }
     */
    public static final long pedestrianCall$offset() {
        return pedestrianCall$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PedestrianCall_t pedestrianCall
     * }
     */
    public static int pedestrianCall(MemorySegment struct) {
        return struct.get(pedestrianCall$LAYOUT, pedestrianCall$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PedestrianCall_t pedestrianCall
     * }
     */
    public static void pedestrianCall(MemorySegment struct, int fieldValue) {
        struct.set(pedestrianCall$LAYOUT, pedestrianCall$OFFSET, fieldValue);
    }

    private static final OfInt actuatedinterval$LAYOUT = (OfInt)$LAYOUT.select(groupElement("actuatedinterval"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ActuatedInterval_t actuatedinterval
     * }
     */
    public static final OfInt actuatedinterval$layout() {
        return actuatedinterval$LAYOUT;
    }

    private static final long actuatedinterval$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ActuatedInterval_t actuatedinterval
     * }
     */
    public static final long actuatedinterval$offset() {
        return actuatedinterval$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ActuatedInterval_t actuatedinterval
     * }
     */
    public static int actuatedinterval(MemorySegment struct) {
        return struct.get(actuatedinterval$LAYOUT, actuatedinterval$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ActuatedInterval_t actuatedinterval
     * }
     */
    public static void actuatedinterval(MemorySegment struct, int fieldValue) {
        struct.set(actuatedinterval$LAYOUT, actuatedinterval$OFFSET, fieldValue);
    }

    private static final OfLong permissiveNonProtected$LAYOUT = (OfLong)$LAYOUT.select(groupElement("permissiveNonProtected"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PermissiveNonProtected_t permissiveNonProtected
     * }
     */
    public static final OfLong permissiveNonProtected$layout() {
        return permissiveNonProtected$LAYOUT;
    }

    private static final long permissiveNonProtected$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PermissiveNonProtected_t permissiveNonProtected
     * }
     */
    public static final long permissiveNonProtected$offset() {
        return permissiveNonProtected$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PermissiveNonProtected_t permissiveNonProtected
     * }
     */
    public static long permissiveNonProtected(MemorySegment struct) {
        return struct.get(permissiveNonProtected$LAYOUT, permissiveNonProtected$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PermissiveNonProtected_t permissiveNonProtected
     * }
     */
    public static void permissiveNonProtected(MemorySegment struct, long fieldValue) {
        struct.set(permissiveNonProtected$LAYOUT, permissiveNonProtected$OFFSET, fieldValue);
    }

    private static final OfLong lightingStatus$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lightingStatus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TrafficLightingStatus_t lightingStatus
     * }
     */
    public static final OfLong lightingStatus$layout() {
        return lightingStatus$LAYOUT;
    }

    private static final long lightingStatus$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TrafficLightingStatus_t lightingStatus
     * }
     */
    public static final long lightingStatus$offset() {
        return lightingStatus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TrafficLightingStatus_t lightingStatus
     * }
     */
    public static long lightingStatus(MemorySegment struct) {
        return struct.get(lightingStatus$LAYOUT, lightingStatus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TrafficLightingStatus_t lightingStatus
     * }
     */
    public static void lightingStatus(MemorySegment struct, long fieldValue) {
        struct.set(lightingStatus$LAYOUT, lightingStatus$OFFSET, fieldValue);
    }

    private static final OfLong maxIntervalLength$LAYOUT = (OfLong)$LAYOUT.select(groupElement("maxIntervalLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TimeInSecond_B8_t maxIntervalLength
     * }
     */
    public static final OfLong maxIntervalLength$layout() {
        return maxIntervalLength$LAYOUT;
    }

    private static final long maxIntervalLength$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TimeInSecond_B8_t maxIntervalLength
     * }
     */
    public static final long maxIntervalLength$offset() {
        return maxIntervalLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TimeInSecond_B8_t maxIntervalLength
     * }
     */
    public static long maxIntervalLength(MemorySegment struct) {
        return struct.get(maxIntervalLength$LAYOUT, maxIntervalLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TimeInSecond_B8_t maxIntervalLength
     * }
     */
    public static void maxIntervalLength(MemorySegment struct, long fieldValue) {
        struct.set(maxIntervalLength$LAYOUT, maxIntervalLength$OFFSET, fieldValue);
    }

    private static final OfLong remainingTime$LAYOUT = (OfLong)$LAYOUT.select(groupElement("remainingTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TimeInSecond_B8_t remainingTime
     * }
     */
    public static final OfLong remainingTime$layout() {
        return remainingTime$LAYOUT;
    }

    private static final long remainingTime$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TimeInSecond_B8_t remainingTime
     * }
     */
    public static final long remainingTime$offset() {
        return remainingTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TimeInSecond_B8_t remainingTime
     * }
     */
    public static long remainingTime(MemorySegment struct) {
        return struct.get(remainingTime$LAYOUT, remainingTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TimeInSecond_B8_t remainingTime
     * }
     */
    public static void remainingTime(MemorySegment struct, long fieldValue) {
        struct.set(remainingTime$LAYOUT, remainingTime$OFFSET, fieldValue);
    }

    private static final OfLong directionCode$LAYOUT = (OfLong)$LAYOUT.select(groupElement("directionCode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TrafficLightDirectionCode_t directionCode
     * }
     */
    public static final OfLong directionCode$layout() {
        return directionCode$LAYOUT;
    }

    private static final long directionCode$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TrafficLightDirectionCode_t directionCode
     * }
     */
    public static final long directionCode$offset() {
        return directionCode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TrafficLightDirectionCode_t directionCode
     * }
     */
    public static long directionCode(MemorySegment struct) {
        return struct.get(directionCode$LAYOUT, directionCode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TrafficLightDirectionCode_t directionCode
     * }
     */
    public static void directionCode(MemorySegment struct, long fieldValue) {
        struct.set(directionCode$LAYOUT, directionCode$OFFSET, fieldValue);
    }

    private static final OfInt reserved$LAYOUT = (OfInt)$LAYOUT.select(groupElement("reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ReservedBit_t reserved
     * }
     */
    public static final OfInt reserved$layout() {
        return reserved$LAYOUT;
    }

    private static final long reserved$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ReservedBit_t reserved
     * }
     */
    public static final long reserved$offset() {
        return reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ReservedBit_t reserved
     * }
     */
    public static int reserved(MemorySegment struct) {
        return struct.get(reserved$LAYOUT, reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ReservedBit_t reserved
     * }
     */
    public static void reserved(MemorySegment struct, int fieldValue) {
        struct.set(reserved$LAYOUT, reserved$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 80;

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
