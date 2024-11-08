// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct DetectedObjectCommonData {
 *     ObjectType_t objType;
 *     ClassificationConfidence_t objTypeCfd;
 *     ObjectID_t objectID;
 *     MeasurementTimeOffset_t measurementTime;
 *     TimeConfidence_t timeConfidence;
 *     SensorDataSharingMessage_PositionOffsetXYZ_t pos;
 *     PositionConfidenceSet_t posConfidence;
 *     Speed_t speed;
 *     SpeedConfidence_t speedConfidence;
 *     Speed_t *speedZ;
 *     SpeedConfidence_t *speedConfidenceZ;
 *     Heading_t heading;
 *     HeadingConfidence_t headingConf;
 *     struct AccelerationSet4Way *accel4way;
 *     AccelerationConfidence_t *accCfdX;
 *     AccelerationConfidence_t *accCfdY;
 *     AccelerationConfidence_t *accCfdZ;
 *     YawRateConfidence_t *accCfdYaw;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class DetectedObjectCommonData {

    DetectedObjectCommonData() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("objType"),
        MessageFrame_h.C_LONG.withName("objTypeCfd"),
        MessageFrame_h.C_LONG.withName("objectID"),
        MessageFrame_h.C_LONG.withName("measurementTime"),
        MessageFrame_h.C_LONG.withName("timeConfidence"),
        SensorDataSharingMessage_PositionOffsetXYZ.layout().withName("pos"),
        PositionConfidenceSet.layout().withName("posConfidence"),
        MessageFrame_h.C_LONG.withName("speed"),
        MessageFrame_h.C_LONG.withName("speedConfidence"),
        MessageFrame_h.C_POINTER.withName("speedZ"),
        MessageFrame_h.C_POINTER.withName("speedConfidenceZ"),
        MessageFrame_h.C_LONG.withName("heading"),
        MessageFrame_h.C_LONG.withName("headingConf"),
        MessageFrame_h.C_POINTER.withName("accel4way"),
        MessageFrame_h.C_POINTER.withName("accCfdX"),
        MessageFrame_h.C_POINTER.withName("accCfdY"),
        MessageFrame_h.C_POINTER.withName("accCfdZ"),
        MessageFrame_h.C_POINTER.withName("accCfdYaw"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("DetectedObjectCommonData");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong objType$LAYOUT = (OfLong)$LAYOUT.select(groupElement("objType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ObjectType_t objType
     * }
     */
    public static final OfLong objType$layout() {
        return objType$LAYOUT;
    }

    private static final long objType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ObjectType_t objType
     * }
     */
    public static final long objType$offset() {
        return objType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ObjectType_t objType
     * }
     */
    public static long objType(MemorySegment struct) {
        return struct.get(objType$LAYOUT, objType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ObjectType_t objType
     * }
     */
    public static void objType(MemorySegment struct, long fieldValue) {
        struct.set(objType$LAYOUT, objType$OFFSET, fieldValue);
    }

    private static final OfLong objTypeCfd$LAYOUT = (OfLong)$LAYOUT.select(groupElement("objTypeCfd"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ClassificationConfidence_t objTypeCfd
     * }
     */
    public static final OfLong objTypeCfd$layout() {
        return objTypeCfd$LAYOUT;
    }

    private static final long objTypeCfd$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ClassificationConfidence_t objTypeCfd
     * }
     */
    public static final long objTypeCfd$offset() {
        return objTypeCfd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ClassificationConfidence_t objTypeCfd
     * }
     */
    public static long objTypeCfd(MemorySegment struct) {
        return struct.get(objTypeCfd$LAYOUT, objTypeCfd$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ClassificationConfidence_t objTypeCfd
     * }
     */
    public static void objTypeCfd(MemorySegment struct, long fieldValue) {
        struct.set(objTypeCfd$LAYOUT, objTypeCfd$OFFSET, fieldValue);
    }

    private static final OfLong objectID$LAYOUT = (OfLong)$LAYOUT.select(groupElement("objectID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ObjectID_t objectID
     * }
     */
    public static final OfLong objectID$layout() {
        return objectID$LAYOUT;
    }

    private static final long objectID$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ObjectID_t objectID
     * }
     */
    public static final long objectID$offset() {
        return objectID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ObjectID_t objectID
     * }
     */
    public static long objectID(MemorySegment struct) {
        return struct.get(objectID$LAYOUT, objectID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ObjectID_t objectID
     * }
     */
    public static void objectID(MemorySegment struct, long fieldValue) {
        struct.set(objectID$LAYOUT, objectID$OFFSET, fieldValue);
    }

    private static final OfLong measurementTime$LAYOUT = (OfLong)$LAYOUT.select(groupElement("measurementTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * MeasurementTimeOffset_t measurementTime
     * }
     */
    public static final OfLong measurementTime$layout() {
        return measurementTime$LAYOUT;
    }

    private static final long measurementTime$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * MeasurementTimeOffset_t measurementTime
     * }
     */
    public static final long measurementTime$offset() {
        return measurementTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * MeasurementTimeOffset_t measurementTime
     * }
     */
    public static long measurementTime(MemorySegment struct) {
        return struct.get(measurementTime$LAYOUT, measurementTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * MeasurementTimeOffset_t measurementTime
     * }
     */
    public static void measurementTime(MemorySegment struct, long fieldValue) {
        struct.set(measurementTime$LAYOUT, measurementTime$OFFSET, fieldValue);
    }

    private static final OfLong timeConfidence$LAYOUT = (OfLong)$LAYOUT.select(groupElement("timeConfidence"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TimeConfidence_t timeConfidence
     * }
     */
    public static final OfLong timeConfidence$layout() {
        return timeConfidence$LAYOUT;
    }

    private static final long timeConfidence$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TimeConfidence_t timeConfidence
     * }
     */
    public static final long timeConfidence$offset() {
        return timeConfidence$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TimeConfidence_t timeConfidence
     * }
     */
    public static long timeConfidence(MemorySegment struct) {
        return struct.get(timeConfidence$LAYOUT, timeConfidence$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TimeConfidence_t timeConfidence
     * }
     */
    public static void timeConfidence(MemorySegment struct, long fieldValue) {
        struct.set(timeConfidence$LAYOUT, timeConfidence$OFFSET, fieldValue);
    }

    private static final GroupLayout pos$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("pos"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SensorDataSharingMessage_PositionOffsetXYZ_t pos
     * }
     */
    public static final GroupLayout pos$layout() {
        return pos$LAYOUT;
    }

    private static final long pos$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SensorDataSharingMessage_PositionOffsetXYZ_t pos
     * }
     */
    public static final long pos$offset() {
        return pos$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SensorDataSharingMessage_PositionOffsetXYZ_t pos
     * }
     */
    public static MemorySegment pos(MemorySegment struct) {
        return struct.asSlice(pos$OFFSET, pos$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SensorDataSharingMessage_PositionOffsetXYZ_t pos
     * }
     */
    public static void pos(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pos$OFFSET, pos$LAYOUT.byteSize());
    }

    private static final GroupLayout posConfidence$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("posConfidence"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PositionConfidenceSet_t posConfidence
     * }
     */
    public static final GroupLayout posConfidence$layout() {
        return posConfidence$LAYOUT;
    }

    private static final long posConfidence$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PositionConfidenceSet_t posConfidence
     * }
     */
    public static final long posConfidence$offset() {
        return posConfidence$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PositionConfidenceSet_t posConfidence
     * }
     */
    public static MemorySegment posConfidence(MemorySegment struct) {
        return struct.asSlice(posConfidence$OFFSET, posConfidence$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PositionConfidenceSet_t posConfidence
     * }
     */
    public static void posConfidence(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, posConfidence$OFFSET, posConfidence$LAYOUT.byteSize());
    }

    private static final OfLong speed$LAYOUT = (OfLong)$LAYOUT.select(groupElement("speed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Speed_t speed
     * }
     */
    public static final OfLong speed$layout() {
        return speed$LAYOUT;
    }

    private static final long speed$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Speed_t speed
     * }
     */
    public static final long speed$offset() {
        return speed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Speed_t speed
     * }
     */
    public static long speed(MemorySegment struct) {
        return struct.get(speed$LAYOUT, speed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Speed_t speed
     * }
     */
    public static void speed(MemorySegment struct, long fieldValue) {
        struct.set(speed$LAYOUT, speed$OFFSET, fieldValue);
    }

    private static final OfLong speedConfidence$LAYOUT = (OfLong)$LAYOUT.select(groupElement("speedConfidence"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SpeedConfidence_t speedConfidence
     * }
     */
    public static final OfLong speedConfidence$layout() {
        return speedConfidence$LAYOUT;
    }

    private static final long speedConfidence$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SpeedConfidence_t speedConfidence
     * }
     */
    public static final long speedConfidence$offset() {
        return speedConfidence$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SpeedConfidence_t speedConfidence
     * }
     */
    public static long speedConfidence(MemorySegment struct) {
        return struct.get(speedConfidence$LAYOUT, speedConfidence$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SpeedConfidence_t speedConfidence
     * }
     */
    public static void speedConfidence(MemorySegment struct, long fieldValue) {
        struct.set(speedConfidence$LAYOUT, speedConfidence$OFFSET, fieldValue);
    }

    private static final AddressLayout speedZ$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("speedZ"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Speed_t *speedZ
     * }
     */
    public static final AddressLayout speedZ$layout() {
        return speedZ$LAYOUT;
    }

    private static final long speedZ$OFFSET = 144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Speed_t *speedZ
     * }
     */
    public static final long speedZ$offset() {
        return speedZ$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Speed_t *speedZ
     * }
     */
    public static MemorySegment speedZ(MemorySegment struct) {
        return struct.get(speedZ$LAYOUT, speedZ$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Speed_t *speedZ
     * }
     */
    public static void speedZ(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(speedZ$LAYOUT, speedZ$OFFSET, fieldValue);
    }

    private static final AddressLayout speedConfidenceZ$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("speedConfidenceZ"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SpeedConfidence_t *speedConfidenceZ
     * }
     */
    public static final AddressLayout speedConfidenceZ$layout() {
        return speedConfidenceZ$LAYOUT;
    }

    private static final long speedConfidenceZ$OFFSET = 152;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SpeedConfidence_t *speedConfidenceZ
     * }
     */
    public static final long speedConfidenceZ$offset() {
        return speedConfidenceZ$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SpeedConfidence_t *speedConfidenceZ
     * }
     */
    public static MemorySegment speedConfidenceZ(MemorySegment struct) {
        return struct.get(speedConfidenceZ$LAYOUT, speedConfidenceZ$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SpeedConfidence_t *speedConfidenceZ
     * }
     */
    public static void speedConfidenceZ(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(speedConfidenceZ$LAYOUT, speedConfidenceZ$OFFSET, fieldValue);
    }

    private static final OfLong heading$LAYOUT = (OfLong)$LAYOUT.select(groupElement("heading"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Heading_t heading
     * }
     */
    public static final OfLong heading$layout() {
        return heading$LAYOUT;
    }

    private static final long heading$OFFSET = 160;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Heading_t heading
     * }
     */
    public static final long heading$offset() {
        return heading$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Heading_t heading
     * }
     */
    public static long heading(MemorySegment struct) {
        return struct.get(heading$LAYOUT, heading$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Heading_t heading
     * }
     */
    public static void heading(MemorySegment struct, long fieldValue) {
        struct.set(heading$LAYOUT, heading$OFFSET, fieldValue);
    }

    private static final OfLong headingConf$LAYOUT = (OfLong)$LAYOUT.select(groupElement("headingConf"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HeadingConfidence_t headingConf
     * }
     */
    public static final OfLong headingConf$layout() {
        return headingConf$LAYOUT;
    }

    private static final long headingConf$OFFSET = 168;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HeadingConfidence_t headingConf
     * }
     */
    public static final long headingConf$offset() {
        return headingConf$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HeadingConfidence_t headingConf
     * }
     */
    public static long headingConf(MemorySegment struct) {
        return struct.get(headingConf$LAYOUT, headingConf$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HeadingConfidence_t headingConf
     * }
     */
    public static void headingConf(MemorySegment struct, long fieldValue) {
        struct.set(headingConf$LAYOUT, headingConf$OFFSET, fieldValue);
    }

    private static final AddressLayout accel4way$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("accel4way"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct AccelerationSet4Way *accel4way
     * }
     */
    public static final AddressLayout accel4way$layout() {
        return accel4way$LAYOUT;
    }

    private static final long accel4way$OFFSET = 176;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct AccelerationSet4Way *accel4way
     * }
     */
    public static final long accel4way$offset() {
        return accel4way$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct AccelerationSet4Way *accel4way
     * }
     */
    public static MemorySegment accel4way(MemorySegment struct) {
        return struct.get(accel4way$LAYOUT, accel4way$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct AccelerationSet4Way *accel4way
     * }
     */
    public static void accel4way(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(accel4way$LAYOUT, accel4way$OFFSET, fieldValue);
    }

    private static final AddressLayout accCfdX$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("accCfdX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AccelerationConfidence_t *accCfdX
     * }
     */
    public static final AddressLayout accCfdX$layout() {
        return accCfdX$LAYOUT;
    }

    private static final long accCfdX$OFFSET = 184;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AccelerationConfidence_t *accCfdX
     * }
     */
    public static final long accCfdX$offset() {
        return accCfdX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AccelerationConfidence_t *accCfdX
     * }
     */
    public static MemorySegment accCfdX(MemorySegment struct) {
        return struct.get(accCfdX$LAYOUT, accCfdX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AccelerationConfidence_t *accCfdX
     * }
     */
    public static void accCfdX(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(accCfdX$LAYOUT, accCfdX$OFFSET, fieldValue);
    }

    private static final AddressLayout accCfdY$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("accCfdY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AccelerationConfidence_t *accCfdY
     * }
     */
    public static final AddressLayout accCfdY$layout() {
        return accCfdY$LAYOUT;
    }

    private static final long accCfdY$OFFSET = 192;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AccelerationConfidence_t *accCfdY
     * }
     */
    public static final long accCfdY$offset() {
        return accCfdY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AccelerationConfidence_t *accCfdY
     * }
     */
    public static MemorySegment accCfdY(MemorySegment struct) {
        return struct.get(accCfdY$LAYOUT, accCfdY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AccelerationConfidence_t *accCfdY
     * }
     */
    public static void accCfdY(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(accCfdY$LAYOUT, accCfdY$OFFSET, fieldValue);
    }

    private static final AddressLayout accCfdZ$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("accCfdZ"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AccelerationConfidence_t *accCfdZ
     * }
     */
    public static final AddressLayout accCfdZ$layout() {
        return accCfdZ$LAYOUT;
    }

    private static final long accCfdZ$OFFSET = 200;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AccelerationConfidence_t *accCfdZ
     * }
     */
    public static final long accCfdZ$offset() {
        return accCfdZ$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AccelerationConfidence_t *accCfdZ
     * }
     */
    public static MemorySegment accCfdZ(MemorySegment struct) {
        return struct.get(accCfdZ$LAYOUT, accCfdZ$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AccelerationConfidence_t *accCfdZ
     * }
     */
    public static void accCfdZ(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(accCfdZ$LAYOUT, accCfdZ$OFFSET, fieldValue);
    }

    private static final AddressLayout accCfdYaw$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("accCfdYaw"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * YawRateConfidence_t *accCfdYaw
     * }
     */
    public static final AddressLayout accCfdYaw$layout() {
        return accCfdYaw$LAYOUT;
    }

    private static final long accCfdYaw$OFFSET = 208;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * YawRateConfidence_t *accCfdYaw
     * }
     */
    public static final long accCfdYaw$offset() {
        return accCfdYaw$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * YawRateConfidence_t *accCfdYaw
     * }
     */
    public static MemorySegment accCfdYaw(MemorySegment struct) {
        return struct.get(accCfdYaw$LAYOUT, accCfdYaw$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * YawRateConfidence_t *accCfdYaw
     * }
     */
    public static void accCfdYaw(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(accCfdYaw$LAYOUT, accCfdYaw$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 216;

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

