// Generated by jextract

package j2735_2024_MessageFrame;

/**
 * {@snippet lang=c :
 * typedef struct IntersectionAccessPoint {
 *     IntersectionAccessPoint_PR present;
 *     union IntersectionAccessPoint_u {
 *         LaneID_t lane;
 *         ApproachID_t approach;
 *         LaneConnectionID_t connection;
 *     } choice;
 *     asn_struct_ctx_t _asn_ctx;
 * } IntersectionAccessPoint_t
 * }
 */
public class IntersectionAccessPoint_t extends IntersectionAccessPoint {

    IntersectionAccessPoint_t() {
        // Should not be called directly
    }
}

