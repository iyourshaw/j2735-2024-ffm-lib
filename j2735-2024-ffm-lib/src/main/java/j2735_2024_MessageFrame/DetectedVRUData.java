// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct DetectedVRUData {
 *     PersonalDeviceUserType_t *basicType;
 *     struct PropelledInformation *propulsion;
 *     Attachment_t *attachment;
 *     AttachmentRadius_t *radius;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class DetectedVRUData {

    DetectedVRUData() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("basicType"),
        MessageFrame_h.C_POINTER.withName("propulsion"),
        MessageFrame_h.C_POINTER.withName("attachment"),
        MessageFrame_h.C_POINTER.withName("radius"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("DetectedVRUData");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout basicType$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("basicType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PersonalDeviceUserType_t *basicType
     * }
     */
    public static final AddressLayout basicType$layout() {
        return basicType$LAYOUT;
    }

    private static final long basicType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PersonalDeviceUserType_t *basicType
     * }
     */
    public static final long basicType$offset() {
        return basicType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PersonalDeviceUserType_t *basicType
     * }
     */
    public static MemorySegment basicType(MemorySegment struct) {
        return struct.get(basicType$LAYOUT, basicType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PersonalDeviceUserType_t *basicType
     * }
     */
    public static void basicType(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(basicType$LAYOUT, basicType$OFFSET, fieldValue);
    }

    private static final AddressLayout propulsion$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("propulsion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PropelledInformation *propulsion
     * }
     */
    public static final AddressLayout propulsion$layout() {
        return propulsion$LAYOUT;
    }

    private static final long propulsion$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PropelledInformation *propulsion
     * }
     */
    public static final long propulsion$offset() {
        return propulsion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PropelledInformation *propulsion
     * }
     */
    public static MemorySegment propulsion(MemorySegment struct) {
        return struct.get(propulsion$LAYOUT, propulsion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PropelledInformation *propulsion
     * }
     */
    public static void propulsion(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(propulsion$LAYOUT, propulsion$OFFSET, fieldValue);
    }

    private static final AddressLayout attachment$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("attachment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Attachment_t *attachment
     * }
     */
    public static final AddressLayout attachment$layout() {
        return attachment$LAYOUT;
    }

    private static final long attachment$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Attachment_t *attachment
     * }
     */
    public static final long attachment$offset() {
        return attachment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Attachment_t *attachment
     * }
     */
    public static MemorySegment attachment(MemorySegment struct) {
        return struct.get(attachment$LAYOUT, attachment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Attachment_t *attachment
     * }
     */
    public static void attachment(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(attachment$LAYOUT, attachment$OFFSET, fieldValue);
    }

    private static final AddressLayout radius$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("radius"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AttachmentRadius_t *radius
     * }
     */
    public static final AddressLayout radius$layout() {
        return radius$LAYOUT;
    }

    private static final long radius$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AttachmentRadius_t *radius
     * }
     */
    public static final long radius$offset() {
        return radius$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AttachmentRadius_t *radius
     * }
     */
    public static MemorySegment radius(MemorySegment struct) {
        return struct.get(radius$LAYOUT, radius$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AttachmentRadius_t *radius
     * }
     */
    public static void radius(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(radius$LAYOUT, radius$OFFSET, fieldValue);
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

