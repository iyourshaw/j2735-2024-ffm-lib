// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct Header {
 *     DYear_t *year;
 *     MinuteOfTheYear_t *timeStamp;
 *     DSecond_t *secMark;
 *     Common_MsgCount_t *msgIssueRevision;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class Header {

    Header() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("year"),
        MessageFrame_h.C_POINTER.withName("timeStamp"),
        MessageFrame_h.C_POINTER.withName("secMark"),
        MessageFrame_h.C_POINTER.withName("msgIssueRevision"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("Header");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout year$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("year"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DYear_t *year
     * }
     */
    public static final AddressLayout year$layout() {
        return year$LAYOUT;
    }

    private static final long year$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DYear_t *year
     * }
     */
    public static final long year$offset() {
        return year$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DYear_t *year
     * }
     */
    public static MemorySegment year(MemorySegment struct) {
        return struct.get(year$LAYOUT, year$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DYear_t *year
     * }
     */
    public static void year(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(year$LAYOUT, year$OFFSET, fieldValue);
    }

    private static final AddressLayout timeStamp$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("timeStamp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * MinuteOfTheYear_t *timeStamp
     * }
     */
    public static final AddressLayout timeStamp$layout() {
        return timeStamp$LAYOUT;
    }

    private static final long timeStamp$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * MinuteOfTheYear_t *timeStamp
     * }
     */
    public static final long timeStamp$offset() {
        return timeStamp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * MinuteOfTheYear_t *timeStamp
     * }
     */
    public static MemorySegment timeStamp(MemorySegment struct) {
        return struct.get(timeStamp$LAYOUT, timeStamp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * MinuteOfTheYear_t *timeStamp
     * }
     */
    public static void timeStamp(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(timeStamp$LAYOUT, timeStamp$OFFSET, fieldValue);
    }

    private static final AddressLayout secMark$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("secMark"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DSecond_t *secMark
     * }
     */
    public static final AddressLayout secMark$layout() {
        return secMark$LAYOUT;
    }

    private static final long secMark$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DSecond_t *secMark
     * }
     */
    public static final long secMark$offset() {
        return secMark$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DSecond_t *secMark
     * }
     */
    public static MemorySegment secMark(MemorySegment struct) {
        return struct.get(secMark$LAYOUT, secMark$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DSecond_t *secMark
     * }
     */
    public static void secMark(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(secMark$LAYOUT, secMark$OFFSET, fieldValue);
    }

    private static final AddressLayout msgIssueRevision$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("msgIssueRevision"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Common_MsgCount_t *msgIssueRevision
     * }
     */
    public static final AddressLayout msgIssueRevision$layout() {
        return msgIssueRevision$LAYOUT;
    }

    private static final long msgIssueRevision$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Common_MsgCount_t *msgIssueRevision
     * }
     */
    public static final long msgIssueRevision$offset() {
        return msgIssueRevision$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Common_MsgCount_t *msgIssueRevision
     * }
     */
    public static MemorySegment msgIssueRevision(MemorySegment struct) {
        return struct.get(msgIssueRevision$LAYOUT, msgIssueRevision$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Common_MsgCount_t *msgIssueRevision
     * }
     */
    public static void msgIssueRevision(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(msgIssueRevision$LAYOUT, msgIssueRevision$OFFSET, fieldValue);
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
