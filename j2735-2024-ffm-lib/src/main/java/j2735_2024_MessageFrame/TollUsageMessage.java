// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct TollUsageMessage {
 *     TollChargerInfo_t tollPointInfo;
 *     TemporaryID_t tempID;
 *     Common_MsgCount_t tumSequenceNum;
 *     Common_MsgCount_t tamSequenceNum;
 *     TumHash_t *tumHash;
 *     EncryptedTumData_t encryptedTumData;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class TollUsageMessage {

    TollUsageMessage() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        TollChargerInfo.layout().withName("tollPointInfo"),
        OCTET_STRING.layout().withName("tempID"),
        MessageFrame_h.C_LONG.withName("tumSequenceNum"),
        MessageFrame_h.C_LONG.withName("tamSequenceNum"),
        MessageFrame_h.C_POINTER.withName("tumHash"),
        OCTET_STRING.layout().withName("encryptedTumData"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("TollUsageMessage");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout tollPointInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("tollPointInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TollChargerInfo_t tollPointInfo
     * }
     */
    public static final GroupLayout tollPointInfo$layout() {
        return tollPointInfo$LAYOUT;
    }

    private static final long tollPointInfo$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TollChargerInfo_t tollPointInfo
     * }
     */
    public static final long tollPointInfo$offset() {
        return tollPointInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TollChargerInfo_t tollPointInfo
     * }
     */
    public static MemorySegment tollPointInfo(MemorySegment struct) {
        return struct.asSlice(tollPointInfo$OFFSET, tollPointInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TollChargerInfo_t tollPointInfo
     * }
     */
    public static void tollPointInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, tollPointInfo$OFFSET, tollPointInfo$LAYOUT.byteSize());
    }

    private static final GroupLayout tempID$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("tempID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TemporaryID_t tempID
     * }
     */
    public static final GroupLayout tempID$layout() {
        return tempID$LAYOUT;
    }

    private static final long tempID$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TemporaryID_t tempID
     * }
     */
    public static final long tempID$offset() {
        return tempID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TemporaryID_t tempID
     * }
     */
    public static MemorySegment tempID(MemorySegment struct) {
        return struct.asSlice(tempID$OFFSET, tempID$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TemporaryID_t tempID
     * }
     */
    public static void tempID(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, tempID$OFFSET, tempID$LAYOUT.byteSize());
    }

    private static final OfLong tumSequenceNum$LAYOUT = (OfLong)$LAYOUT.select(groupElement("tumSequenceNum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Common_MsgCount_t tumSequenceNum
     * }
     */
    public static final OfLong tumSequenceNum$layout() {
        return tumSequenceNum$LAYOUT;
    }

    private static final long tumSequenceNum$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Common_MsgCount_t tumSequenceNum
     * }
     */
    public static final long tumSequenceNum$offset() {
        return tumSequenceNum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Common_MsgCount_t tumSequenceNum
     * }
     */
    public static long tumSequenceNum(MemorySegment struct) {
        return struct.get(tumSequenceNum$LAYOUT, tumSequenceNum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Common_MsgCount_t tumSequenceNum
     * }
     */
    public static void tumSequenceNum(MemorySegment struct, long fieldValue) {
        struct.set(tumSequenceNum$LAYOUT, tumSequenceNum$OFFSET, fieldValue);
    }

    private static final OfLong tamSequenceNum$LAYOUT = (OfLong)$LAYOUT.select(groupElement("tamSequenceNum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Common_MsgCount_t tamSequenceNum
     * }
     */
    public static final OfLong tamSequenceNum$layout() {
        return tamSequenceNum$LAYOUT;
    }

    private static final long tamSequenceNum$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Common_MsgCount_t tamSequenceNum
     * }
     */
    public static final long tamSequenceNum$offset() {
        return tamSequenceNum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Common_MsgCount_t tamSequenceNum
     * }
     */
    public static long tamSequenceNum(MemorySegment struct) {
        return struct.get(tamSequenceNum$LAYOUT, tamSequenceNum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Common_MsgCount_t tamSequenceNum
     * }
     */
    public static void tamSequenceNum(MemorySegment struct, long fieldValue) {
        struct.set(tamSequenceNum$LAYOUT, tamSequenceNum$OFFSET, fieldValue);
    }

    private static final AddressLayout tumHash$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("tumHash"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TumHash_t *tumHash
     * }
     */
    public static final AddressLayout tumHash$layout() {
        return tumHash$LAYOUT;
    }

    private static final long tumHash$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TumHash_t *tumHash
     * }
     */
    public static final long tumHash$offset() {
        return tumHash$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TumHash_t *tumHash
     * }
     */
    public static MemorySegment tumHash(MemorySegment struct) {
        return struct.get(tumHash$LAYOUT, tumHash$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TumHash_t *tumHash
     * }
     */
    public static void tumHash(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(tumHash$LAYOUT, tumHash$OFFSET, fieldValue);
    }

    private static final GroupLayout encryptedTumData$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("encryptedTumData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EncryptedTumData_t encryptedTumData
     * }
     */
    public static final GroupLayout encryptedTumData$layout() {
        return encryptedTumData$LAYOUT;
    }

    private static final long encryptedTumData$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EncryptedTumData_t encryptedTumData
     * }
     */
    public static final long encryptedTumData$offset() {
        return encryptedTumData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EncryptedTumData_t encryptedTumData
     * }
     */
    public static MemorySegment encryptedTumData(MemorySegment struct) {
        return struct.asSlice(encryptedTumData$OFFSET, encryptedTumData$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EncryptedTumData_t encryptedTumData
     * }
     */
    public static void encryptedTumData(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, encryptedTumData$OFFSET, encryptedTumData$LAYOUT.byteSize());
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

    private static final long _asn_ctx$OFFSET = 160;

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

