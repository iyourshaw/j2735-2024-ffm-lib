// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct ReportCharacteristics {
 *     DDateTime_t timeStamp;
 *     Position3D_t position;
 *     PositionalAccuracy_t posAccuracy;
 *     RptVelocity_t velocity;
 *     RptVehicleClass_t *vehicleClass;
 *     struct RptDevType *devType;
 *     struct VehicleSize *vehicleSize;
 *     VehicleMass_t *vehicleMass;
 *     long *vehPassengerCount;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class ReportCharacteristics {

    ReportCharacteristics() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        DDateTime.layout().withName("timeStamp"),
        Position3D.layout().withName("position"),
        PositionalAccuracy.layout().withName("posAccuracy"),
        RptVelocity.layout().withName("velocity"),
        MessageFrame_h.C_POINTER.withName("vehicleClass"),
        MessageFrame_h.C_POINTER.withName("devType"),
        MessageFrame_h.C_POINTER.withName("vehicleSize"),
        MessageFrame_h.C_POINTER.withName("vehicleMass"),
        MessageFrame_h.C_POINTER.withName("vehPassengerCount"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("ReportCharacteristics");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout timeStamp$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("timeStamp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DDateTime_t timeStamp
     * }
     */
    public static final GroupLayout timeStamp$layout() {
        return timeStamp$LAYOUT;
    }

    private static final long timeStamp$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DDateTime_t timeStamp
     * }
     */
    public static final long timeStamp$offset() {
        return timeStamp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DDateTime_t timeStamp
     * }
     */
    public static MemorySegment timeStamp(MemorySegment struct) {
        return struct.asSlice(timeStamp$OFFSET, timeStamp$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DDateTime_t timeStamp
     * }
     */
    public static void timeStamp(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, timeStamp$OFFSET, timeStamp$LAYOUT.byteSize());
    }

    private static final GroupLayout position$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("position"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Position3D_t position
     * }
     */
    public static final GroupLayout position$layout() {
        return position$LAYOUT;
    }

    private static final long position$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Position3D_t position
     * }
     */
    public static final long position$offset() {
        return position$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Position3D_t position
     * }
     */
    public static MemorySegment position(MemorySegment struct) {
        return struct.asSlice(position$OFFSET, position$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Position3D_t position
     * }
     */
    public static void position(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, position$OFFSET, position$LAYOUT.byteSize());
    }

    private static final GroupLayout posAccuracy$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("posAccuracy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PositionalAccuracy_t posAccuracy
     * }
     */
    public static final GroupLayout posAccuracy$layout() {
        return posAccuracy$LAYOUT;
    }

    private static final long posAccuracy$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PositionalAccuracy_t posAccuracy
     * }
     */
    public static final long posAccuracy$offset() {
        return posAccuracy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PositionalAccuracy_t posAccuracy
     * }
     */
    public static MemorySegment posAccuracy(MemorySegment struct) {
        return struct.asSlice(posAccuracy$OFFSET, posAccuracy$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PositionalAccuracy_t posAccuracy
     * }
     */
    public static void posAccuracy(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, posAccuracy$OFFSET, posAccuracy$LAYOUT.byteSize());
    }

    private static final GroupLayout velocity$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("velocity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RptVelocity_t velocity
     * }
     */
    public static final GroupLayout velocity$layout() {
        return velocity$LAYOUT;
    }

    private static final long velocity$OFFSET = 184;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RptVelocity_t velocity
     * }
     */
    public static final long velocity$offset() {
        return velocity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RptVelocity_t velocity
     * }
     */
    public static MemorySegment velocity(MemorySegment struct) {
        return struct.asSlice(velocity$OFFSET, velocity$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RptVelocity_t velocity
     * }
     */
    public static void velocity(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, velocity$OFFSET, velocity$LAYOUT.byteSize());
    }

    private static final AddressLayout vehicleClass$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("vehicleClass"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RptVehicleClass_t *vehicleClass
     * }
     */
    public static final AddressLayout vehicleClass$layout() {
        return vehicleClass$LAYOUT;
    }

    private static final long vehicleClass$OFFSET = 232;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RptVehicleClass_t *vehicleClass
     * }
     */
    public static final long vehicleClass$offset() {
        return vehicleClass$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RptVehicleClass_t *vehicleClass
     * }
     */
    public static MemorySegment vehicleClass(MemorySegment struct) {
        return struct.get(vehicleClass$LAYOUT, vehicleClass$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RptVehicleClass_t *vehicleClass
     * }
     */
    public static void vehicleClass(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(vehicleClass$LAYOUT, vehicleClass$OFFSET, fieldValue);
    }

    private static final AddressLayout devType$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("devType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct RptDevType *devType
     * }
     */
    public static final AddressLayout devType$layout() {
        return devType$LAYOUT;
    }

    private static final long devType$OFFSET = 240;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct RptDevType *devType
     * }
     */
    public static final long devType$offset() {
        return devType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct RptDevType *devType
     * }
     */
    public static MemorySegment devType(MemorySegment struct) {
        return struct.get(devType$LAYOUT, devType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct RptDevType *devType
     * }
     */
    public static void devType(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(devType$LAYOUT, devType$OFFSET, fieldValue);
    }

    private static final AddressLayout vehicleSize$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("vehicleSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct VehicleSize *vehicleSize
     * }
     */
    public static final AddressLayout vehicleSize$layout() {
        return vehicleSize$LAYOUT;
    }

    private static final long vehicleSize$OFFSET = 248;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct VehicleSize *vehicleSize
     * }
     */
    public static final long vehicleSize$offset() {
        return vehicleSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct VehicleSize *vehicleSize
     * }
     */
    public static MemorySegment vehicleSize(MemorySegment struct) {
        return struct.get(vehicleSize$LAYOUT, vehicleSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct VehicleSize *vehicleSize
     * }
     */
    public static void vehicleSize(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(vehicleSize$LAYOUT, vehicleSize$OFFSET, fieldValue);
    }

    private static final AddressLayout vehicleMass$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("vehicleMass"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VehicleMass_t *vehicleMass
     * }
     */
    public static final AddressLayout vehicleMass$layout() {
        return vehicleMass$LAYOUT;
    }

    private static final long vehicleMass$OFFSET = 256;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VehicleMass_t *vehicleMass
     * }
     */
    public static final long vehicleMass$offset() {
        return vehicleMass$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VehicleMass_t *vehicleMass
     * }
     */
    public static MemorySegment vehicleMass(MemorySegment struct) {
        return struct.get(vehicleMass$LAYOUT, vehicleMass$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VehicleMass_t *vehicleMass
     * }
     */
    public static void vehicleMass(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(vehicleMass$LAYOUT, vehicleMass$OFFSET, fieldValue);
    }

    private static final AddressLayout vehPassengerCount$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("vehPassengerCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long *vehPassengerCount
     * }
     */
    public static final AddressLayout vehPassengerCount$layout() {
        return vehPassengerCount$LAYOUT;
    }

    private static final long vehPassengerCount$OFFSET = 264;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long *vehPassengerCount
     * }
     */
    public static final long vehPassengerCount$offset() {
        return vehPassengerCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long *vehPassengerCount
     * }
     */
    public static MemorySegment vehPassengerCount(MemorySegment struct) {
        return struct.get(vehPassengerCount$LAYOUT, vehPassengerCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long *vehPassengerCount
     * }
     */
    public static void vehPassengerCount(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(vehPassengerCount$LAYOUT, vehPassengerCount$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 272;

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

