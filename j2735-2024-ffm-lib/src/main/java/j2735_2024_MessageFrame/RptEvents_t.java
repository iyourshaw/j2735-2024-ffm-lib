// Generated by jextract

package j2735_2024_MessageFrame;

/**
 * {@snippet lang=c :
 * typedef struct RptEvents {
 *     RptEvents_PR present;
 *     union RptEvents_u {
 *         BOOLEAN_t absActive;
 *         BOOLEAN_t tractionCtlLoss;
 *         BOOLEAN_t stabilityCtlActive;
 *         BOOLEAN_t hardBraking;
 *         BOOLEAN_t swerve;
 *     } choice;
 *     asn_struct_ctx_t _asn_ctx;
 * } RptEvents_t
 * }
 */
public class RptEvents_t extends RptEvents {

    RptEvents_t() {
        // Should not be called directly
    }
}
