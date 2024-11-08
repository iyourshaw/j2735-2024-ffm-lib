// Generated by jextract

package j2735_2024_MessageFrame;

/**
 * {@snippet lang=c :
 * typedef struct NodeAttributeSetXY {
 *     struct NodeAttributeXYList *localNode;
 *     struct SegmentAttributeXYList *disabled;
 *     struct SegmentAttributeXYList *enabled;
 *     struct LaneDataAttributeList *data;
 *     Offset_B10_t *dWidth;
 *     Offset_B10_t *dElevation;
 *     struct NodeAttributeSetXY__regional {
 *         struct {
 *             struct Reg_NodeAttributeSetXY **array;
 *             int count;
 *             int size;
 *             void (*free)(struct Reg_NodeAttributeSetXY *);
 *         } list;
 *         asn_struct_ctx_t _asn_ctx;
 *     } *regional;
 *     asn_struct_ctx_t _asn_ctx;
 * } NodeAttributeSetXY_t
 * }
 */
public class NodeAttributeSetXY_t extends NodeAttributeSetXY {

    NodeAttributeSetXY_t() {
        // Should not be called directly
    }
}

