// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct ProbeDataReportMessage {
 *     ConfigId_t configId;
 *     ReportCharacteristics_t reportChar;
 *     struct RoadAuthorityID *roadAuthorityID;
 *     struct RptInstantaneousRecords *instantaneousRecs;
 *     struct RptAveragedAndSummaryRecord *avgAndSumRec;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class ProbeDataReportMessage {

    ProbeDataReportMessage() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("configId"),
        ReportCharacteristics.layout().withName("reportChar"),
        MessageFrame_h.C_POINTER.withName("roadAuthorityID"),
        MessageFrame_h.C_POINTER.withName("instantaneousRecs"),
        MessageFrame_h.C_POINTER.withName("avgAndSumRec"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("ProbeDataReportMessage");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong configId$LAYOUT = (OfLong)$LAYOUT.select(groupElement("configId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ConfigId_t configId
     * }
     */
    public static final OfLong configId$layout() {
        return configId$LAYOUT;
    }

    private static final long configId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ConfigId_t configId
     * }
     */
    public static final long configId$offset() {
        return configId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ConfigId_t configId
     * }
     */
    public static long configId(MemorySegment struct) {
        return struct.get(configId$LAYOUT, configId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ConfigId_t configId
     * }
     */
    public static void configId(MemorySegment struct, long fieldValue) {
        struct.set(configId$LAYOUT, configId$OFFSET, fieldValue);
    }

    private static final GroupLayout reportChar$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("reportChar"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ReportCharacteristics_t reportChar
     * }
     */
    public static final GroupLayout reportChar$layout() {
        return reportChar$LAYOUT;
    }

    private static final long reportChar$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ReportCharacteristics_t reportChar
     * }
     */
    public static final long reportChar$offset() {
        return reportChar$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ReportCharacteristics_t reportChar
     * }
     */
    public static MemorySegment reportChar(MemorySegment struct) {
        return struct.asSlice(reportChar$OFFSET, reportChar$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ReportCharacteristics_t reportChar
     * }
     */
    public static void reportChar(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, reportChar$OFFSET, reportChar$LAYOUT.byteSize());
    }

    private static final AddressLayout roadAuthorityID$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("roadAuthorityID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct RoadAuthorityID *roadAuthorityID
     * }
     */
    public static final AddressLayout roadAuthorityID$layout() {
        return roadAuthorityID$LAYOUT;
    }

    private static final long roadAuthorityID$OFFSET = 304;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct RoadAuthorityID *roadAuthorityID
     * }
     */
    public static final long roadAuthorityID$offset() {
        return roadAuthorityID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct RoadAuthorityID *roadAuthorityID
     * }
     */
    public static MemorySegment roadAuthorityID(MemorySegment struct) {
        return struct.get(roadAuthorityID$LAYOUT, roadAuthorityID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct RoadAuthorityID *roadAuthorityID
     * }
     */
    public static void roadAuthorityID(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(roadAuthorityID$LAYOUT, roadAuthorityID$OFFSET, fieldValue);
    }

    private static final AddressLayout instantaneousRecs$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("instantaneousRecs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct RptInstantaneousRecords *instantaneousRecs
     * }
     */
    public static final AddressLayout instantaneousRecs$layout() {
        return instantaneousRecs$LAYOUT;
    }

    private static final long instantaneousRecs$OFFSET = 312;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct RptInstantaneousRecords *instantaneousRecs
     * }
     */
    public static final long instantaneousRecs$offset() {
        return instantaneousRecs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct RptInstantaneousRecords *instantaneousRecs
     * }
     */
    public static MemorySegment instantaneousRecs(MemorySegment struct) {
        return struct.get(instantaneousRecs$LAYOUT, instantaneousRecs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct RptInstantaneousRecords *instantaneousRecs
     * }
     */
    public static void instantaneousRecs(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(instantaneousRecs$LAYOUT, instantaneousRecs$OFFSET, fieldValue);
    }

    private static final AddressLayout avgAndSumRec$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("avgAndSumRec"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct RptAveragedAndSummaryRecord *avgAndSumRec
     * }
     */
    public static final AddressLayout avgAndSumRec$layout() {
        return avgAndSumRec$LAYOUT;
    }

    private static final long avgAndSumRec$OFFSET = 320;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct RptAveragedAndSummaryRecord *avgAndSumRec
     * }
     */
    public static final long avgAndSumRec$offset() {
        return avgAndSumRec$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct RptAveragedAndSummaryRecord *avgAndSumRec
     * }
     */
    public static MemorySegment avgAndSumRec(MemorySegment struct) {
        return struct.get(avgAndSumRec$LAYOUT, avgAndSumRec$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct RptAveragedAndSummaryRecord *avgAndSumRec
     * }
     */
    public static void avgAndSumRec(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(avgAndSumRec$LAYOUT, avgAndSumRec$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 328;

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
