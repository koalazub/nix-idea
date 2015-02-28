// This is a generated file. Not intended for manual editing.
package cc.cflags.nixitch.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cc.cflags.nixitch.psi.NixTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import cc.cflags.nixitch.psi.*;

public class NixNixInitImpl extends ASTWrapperPsiElement implements NixNixInit {

  public NixNixInitImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NixVisitor) ((NixVisitor)visitor).visitNixInit(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NixExpr getExpr() {
    return findChildByClass(NixExpr.class);
  }

  @Override
  @NotNull
  public PsiElement getDollarCurly() {
    return findNotNullChildByType(DOLLAR_CURLY);
  }

  @Override
  @Nullable
  public PsiElement getRcurly() {
    return findChildByType(RCURLY);
  }

}
